import os
import requests
import zipfile
from pathlib import Path
from urllib.parse import urlparse

def download_file(url, download_folder):
    # Parse the URL to get the file name
    parsed_url = urlparse(url)
    original_file_name = os.path.basename(parsed_url.path)
    
    # Provide a safe file name (without invalid characters)
    safe_file_name = original_file_name.split('?')[0]
    
    local_filename = os.path.join(download_folder, safe_file_name)
    
    with requests.get(url, stream=True) as r:
        r.raise_for_status()
        with open(local_filename, 'wb') as f:
            for chunk in r.iter_content(chunk_size=8192):
                f.write(chunk)
    return local_filename

def extract_zip_file(file_path, extract_folder):
    with zipfile.ZipFile(file_path, 'r') as zip_ref:
        zip_ref.extractall(extract_folder)

def main():
    # URL of the file to download
    url = "https://siescms-my.sharepoint.com/personal/shauryac_mca23_siescoms_sies_edu_in/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fshauryac%5Fmca23%5Fsiescoms%5Fsies%5Fedu%5Fin%2FDocuments%2FPlacements%20Assignments%2FImpactures%2FSampleZIP%2Ezip&parent=%2Fpersonal%2Fshauryac%5Fmca23%5Fsiescoms%5Fsies%5Fedu%5Fin%2FDocuments%2FPlacements%20Assignments%2FImpactures&ga=1"
    
    # Directory where the file will be downloaded
    download_folder = "C:\\Users\\shaur\\Downloads"
    
    # Ensuring that the download folder exists
    Path(download_folder).mkdir(parents=True, exist_ok=True)
    
    # Downloading the file
    downloaded_file = download_file(url, download_folder)
    print(f"Downloaded: {downloaded_file}")
    
    # Checking if the downloaded file is a zip file
    if zipfile.is_zipfile(downloaded_file):
        # Extracting the ZIP file
        file_name_without_extension = os.path.splitext(os.path.basename(downloaded_file))[0]
        extract_folder = os.path.join("D:\\Extracted Folder", file_name_without_extension)
        
        # Ensure the extract folder exists
        Path(extract_folder).mkdir(parents=True, exist_ok=True)
        
        extract_zip_file(downloaded_file, extract_folder)
        print(f"Extracted: {downloaded_file} to {extract_folder}")
    else:
        print(f"{downloaded_file} is not a zip file.")

if __name__ == "__main__":
    main()
