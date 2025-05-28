Java Code

public class ClipboardHelper
{
    private final Context context;
    private final ClipboardManager clipboardManager;

    public ClipboardHelper(Context context)
    {
        this.context = context;
        this.clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void copyToClipboard(String label, String text)
    {
        ClipData clip = ClipData.newPlainText(label, text);
        clipboardManager.setPrimaryClip(clip);
        showCopyNotification(text);
    }

    public void copyHtmlToClipboard(String label, String html)
    {
        ClipData clip = ClipData.newHtmlText(label, html, html);
        clipboardManager.setPrimaryClip(clip);
        showCopyNotification(html);
    }

    private void showCopyNotification(String content)
    {
        Toast.makeText(context, "Copied to Clipboard - " + content, Toast.LENGTH_SHORT).show();
    }

    public String getClipboardText()
    {
        if (clipboardManager.hasPrimaryClip())
        {
            ClipData clipData = clipboardManager.getPrimaryClip();
            if (clipData != null && clipData.getItemCount() > 0)
            {
                CharSequence text = clipData.getItemAt(0).getText();
                return text != null ? text.toString() : null;
            }
        }
        return null;
    }
}


Kotlin Code

class ClipboardHelper(private val context: Context) 
{

    private val clipboardManager =
        context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

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