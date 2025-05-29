# ClipboardHelper

The ClipboardHelper class is a utility class in Android designed to simplify clipboard operations such as copying plain text or HTML content to the clipboard, retrieving clipboard contents, and showing user feedback via a Toast. This class encapsulates Android’s ClipboardManager functionality to provide a clean and reusable interface for clipboard interactions.

## 🔧 Core Responsibilities

The ClipboardHelper class handles three primary tasks:
	
 1.	Copying Text to Clipboard
It allows copying simple plain text (e.g., names, links, messages) to the clipboard for user convenience.
	
 2.	Copying HTML Content to Clipboard
It supports copying HTML-formatted content that preserves formatting (useful for rich text editors or content sharing features).
	
 3.	Retrieving Clipboard Content
It provides a method to safely fetch and return the current clipboard contents as a String.
	
 4.	User Feedback
Whenever content is copied, a brief Toast notification is shown to inform the user that the action was successful.
