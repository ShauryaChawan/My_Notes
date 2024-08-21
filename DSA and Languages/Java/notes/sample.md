[🏠 Home](../../../README.md) <br/>
[🍵 Java Home](../Java.md)

<hr/>

<h1 style="text-align: center">16. Java Modifiers 📜</h1>

- [Introduction 📖](#introduction-)
- [1. Class 🏛️](#1-class-️)
- [2. Attributes, Methods, and Constructors of a Class 🧩](#2-attributes-methods-and-constructors-of-a-class-)
- [3. Interfaces 🎛️](#3-interfaces-️)
- [4. Attributes and Methods of an Interface ⚙️](#4-attributes-and-methods-of-an-interface-️)
	- [Attributes 🎚️](#attributes-️)
	- [Methods 📋](#methods-)
- [Summary 📝](#summary-)

<hr/>

## Introduction 📖
We divide modifiers into two groups:

- 🔓 **Access Modifiers** - controls the access level
- 🔧 **Non-Access Modifiers** - do not control access level, but provide other functionality

## 1. Class 🏛️

- **Access Modifiers:**
  - `public` 🌐
    - The class is accessible from any other class.
  - `default` (no modifier) 🏢
    - The class is accessible only within its own package.

- **Non-Access Modifiers:**
  - `final` 🚫
    - The class cannot be subclassed.
  - `abstract` 🌀
    - The class cannot be instantiated directly and may contain abstract methods.

<hr/>

<center>
<b>💡 NOTE</b> 

A class cannot be both `final` and `abstract` because an abstract class is meant to be subclassed.
</center>

<hr/>

## 2. Attributes, Methods, and Constructors of a Class 🧩

- **Access Modifiers:**
  - `public` 🌐
    - Accessible from any other class.
  - `protected` 🔐
    - Accessible within the same package and by subclasses.
  - `default` (no modifier) 🏢
    - Accessible only within the same package.
  - `private` 🔒 
    - Accessible only within the class where it is defined.

- **Non-Access Modifiers:**
  - `static` ⚙️
    - The member belongs to the class rather than to any instance.
  - `final` 🚫
    - **For attributes:** The value cannot be changed after initialization.
    - **For methods:** The method cannot be overridden in subclasses.
    - **For constructors:** Constructors cannot be `final`.
  - `abstract` 🌀
    - **For methods:** The method does not have a body and must be implemented by subclasses (only applicable in abstract classes).
  - `synchronized` 🔄
    - The method can be accessed by only one thread at a time.
  - `volatile` 🌬️
    - The variable's value will always be read from the main memory, not from a thread's local cache.
  - `transient` ✈️
    - The attribute will not be serialized.
  - `native` 🌍
    - The method is implemented in a language other than Java (e.g., C/C++).

<hr>

<center>
<b>💡 NOTE</b>

Constructors can only have access modifiers and the `synchronized` modifier, but not `static`, `final`, `abstract`, `native`, or `transient`.
</center>

<hr/>

## 3. Interfaces 🎛️

- **Access Modifiers:**
  - `public` 🌐
    - The interface is accessible from any other class.
  - `default` (no modifier) 🏢
    - The interface is accessible only within its own package.

- **Non-Access Modifiers**:
  - `abstract` 🌀
    - Implicit for interfaces; all interfaces are abstract by definition.

<hr>
<center>
<b>💡 NOTE </b>

The `abstract` keyword is redundant for interfaces because they are implicitly `abstract`. Interfaces cannot be `final`, `synchronized`, `native`, or `volatile`.
</center>

<hr/>

## 4. Attributes and Methods of an Interface ⚙️

### Attributes 🎚️

- **Access Modifiers:**
  - `public` 🌐: All attributes in an interface are `public` by default.

- **Non-Access Modifiers:**
  - `static` ⚙️: Attributes in interfaces are implicitly `static`.
  - `final` 🚫: Attributes in interfaces are implicitly `final` (they are constants).

### Methods 📋

- **Access Modifiers:**
  - `public` 🌐: All methods in an interface are `public` by default.

- **Non-Access Modifiers:**
  - `abstract` 🌀: Methods are `abstract` by default unless they are `default` or `static` methods.
  - `default` 📦: Provides a default implementation for a method in an interface (starting from Java 8).
  - `static` ⚙️: Allows defining `static` methods within an interface (starting from Java 8).

<hr/>

<center><b>💡 NOTE</b>

Interface methods cannot be `final`, `synchronized`, `native`, or `volatile`.
</center>

<hr/>

## Summary 📝

- **Classes:** `public`, `default`, `final`, `abstract`
- **Attributes/Methods/Constructors of Classes:** `public`, `protected`, `private`, `default`, `static`, `final`, `abstract`, `synchronized`, `volatile`, `transient`, `native`
- **Interfaces:** `public`, `default`, `abstract`
- **Attributes/Methods of Interfaces:**
  - **Attributes:** `public`, `static`, `final`
  - **Methods:** `public`, `abstract`, `default`, `static`

<hr/>

[🏠 Home](../../../README.md) <br/>
[🍵 Java Home](../Java.md)
