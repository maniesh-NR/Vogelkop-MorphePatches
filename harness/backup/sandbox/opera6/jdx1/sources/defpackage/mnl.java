package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class mnl implements nol, w7e, bpm {
    public static final String[] b = {"_data"};
    public final ContentResolver a;

    public /* synthetic */ mnl(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.bpm
    public final yb6 c(Uri uri) {
        return new mb2(this.a, uri, (byte) 0);
    }

    @Override // defpackage.nol
    public final Cursor e(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new cpm(this);
    }
}
