package kww.RealtTranslator.Core.Tools;

public class StringUploadProperties extends UploadProperties {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //    public string Content
//    {
//        get { return this.content; }
//        set
//        {
//            this.content = value;
//            this.Bytes = this.encoding.GetBytes(value);
//        }
//    }

//    private Encoding encoding = Encoding.UTF8;
//    public Encoding Encoding
//    {
//        get { return this.encoding; }
//        set
//        {
//            this.encoding = value;
//            if( this.content != null )
//            {
//                this.Bytes = this.encoding.GetBytes(this.content);
//            }
//        }
//    }
}
