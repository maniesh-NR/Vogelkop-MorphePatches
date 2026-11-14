package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* loaded from: classes.dex */
public final class yfl extends jfl {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public yfl(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
