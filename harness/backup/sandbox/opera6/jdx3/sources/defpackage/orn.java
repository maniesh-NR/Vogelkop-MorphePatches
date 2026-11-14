package defpackage;

/* loaded from: classes.dex */
public enum orn {
    TEXT("text"),
    /* JADX INFO: Fake field, exist only in values array */
    VOICE("voice"),
    PROMPT_SUMMARIZE("prompt_summarize"),
    PROMPT_TELL_ME_MORE("prompt_tell_me_more"),
    CONVERSATION_CHIP("conversation_chip"),
    TEXT_WITH_FILE("text_with_file"),
    /* JADX INFO: Fake field, exist only in values array */
    VOICE_WITH_FILE("voice_with_file"),
    EXPLAIN_IMAGE("explain_image"),
    CONVERSATION_CHIP_IMAGE("conversation_chip_image");

    public final String a;

    orn(String str) {
        this.a = str;
    }
}
