package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class pq5 implements oq5, rq5 {
    public final /* synthetic */ byte a = 0;
    public ClipData b;
    public byte c;
    public boolean d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ pq5() {
    }

    public pq5(pq5 pq5Var) {
        ClipData clipData = pq5Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = pq5Var.c;
        jpo.k(b, 0, 5, "source");
        this.c = b;
        this.d = pq5Var.d;
        this.e = pq5Var.e;
        this.f = pq5Var.f;
    }

    @Override // defpackage.oq5
    public final void a(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.rq5
    public final ContentInfo b() {
        return null;
    }

    @Override // defpackage.oq5
    public final sq5 build() {
        return new sq5(new pq5(this));
    }

    @Override // defpackage.rq5
    public final ClipData c() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq5
    public final void d(int i) {
        this.d = i;
    }

    @Override // defpackage.rq5
    public final int e() {
        return this.d ? 1 : 0;
    }

    @Override // defpackage.rq5
    public final int getSource() {
        return this.c;
    }

    @Override // defpackage.oq5
    public final void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                boolean z = this.d;
                sb.append(z ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(z ? 1 : 0));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return z1m.l(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }
}
