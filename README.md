# ✂️ ClipboardHelper

`ClipboardHelper` is a utility class in Android that simplifies clipboard operations such as **copying** and **retrieving** text (plain or HTML) while providing user feedback via **Toast** messages.

It wraps Android’s `ClipboardManager` to offer a **clean**, **reusable**, and **user-friendly** interface for clipboard interactions.

---

## 🔧 Core Responsibilities

The `ClipboardHelper` class handles the following key operations:

- 📝 **Copy Plain Text**
  - Copies simple text (e.g., names, links, messages) to the clipboard.
  - Ideal for standard text-sharing functionality.

- 🖋️ **Copy HTML Content**
  - Supports copying **HTML-formatted content** to retain styling and formatting.
  - Useful for apps with rich-text editors or styled content sharing.

- 📋 **Retrieve Clipboard Content**
  - Provides a method to **safely fetch** current clipboard content.
  - Returns the copied content as a plain `String`.

- ✅ **User Feedback**
  - Shows a **Toast** notification upon successful copy operation.
  - Improves user experience by confirming clipboard actions.

---

## 🚀 Why Use ClipboardHelper?

- Simplifies boilerplate around `ClipboardManager`
- Promotes **code reusability** and cleaner architecture
- Enhances **UX** with immediate visual feedback
- Supports both **plain text** and **HTML**, making it versatile for various app needs

---

## 📱 Typical Use Cases

- Copying shareable links or text
- Copying formatted messages or emails
- Implementing “Copy to Clipboard” features in UI components

---
