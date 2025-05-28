class ClipboardHelper(private val context: Context) 
{
    private val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    fun copyToClipboard(label: String, text: String) 
    {
        val clip = ClipData.newPlainText(label, text)
        clipboardManager.setPrimaryClip(clip)
        showCopyNotification(text)
    }

    fun copyHtmlToClipboard(label: String, html: String) 
    {
        val clip = ClipData.newHtmlText(label, html, html)
        clipboardManager.setPrimaryClip(clip)
        showCopyNotification(html)
    }

    fun getClipboardText(): String? 
    {
        val clipData = clipboardManager.primaryClip
        if (clipboardManager.hasPrimaryClip() && clipData != null && clipData.itemCount > 0) 
        {
            val text = clipData.getItemAt(0).text
            return text?.toString()
        }
        return null
    }

    private fun showCopyNotification(content: String) 
    {
        Toast.makeText(context, "Copied to Clipboard - $content", Toast.LENGTH_SHORT).show()
    }
}