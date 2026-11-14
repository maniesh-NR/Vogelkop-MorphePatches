package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class qq5 implements rq5 {
    public final ContentInfo a;

    public qq5(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // defpackage.rq5
    public final ContentInfo b() {
        return this.a;
    }

    @Override // defpackage.rq5
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.rq5
    public final int e() {
        return this.a.getFlags();
    }

    @Override // defpackage.rq5
    public final int getSource() {
        return this.a.getSource();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
