package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import com.opera.android.snapshot.OfaImageEditorActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ztj extends AsyncTask {
    public final /* synthetic */ File a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ buj d;

    public ztj(buj bujVar, File file, String str, boolean z) {
        this.a = file;
        this.b = str;
        this.c = z;
        this.d = bujVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return Boolean.valueOf(z5i.l0(((Bitmap[]) objArr)[0], this.a, Bitmap.CompressFormat.PNG, 100));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, hjf] */
    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Uri uriFromFile;
        File fileE;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        buj bujVar = this.d;
        if (!zBooleanValue) {
            bujVar.a(2132021582);
            return;
        }
        Uri uriFromFile2 = Uri.fromFile(this.a);
        Uri uri = Uri.parse(this.b);
        bujVar.getClass();
        tn tnVar = new tn();
        tnVar.b = uri;
        tnVar.c = uriFromFile2;
        tnVar.a = this.c;
        Objects.requireNonNull(bujVar);
        tnVar.d = bujVar;
        ?? r6 = bujVar.a;
        if (uriFromFile2 == null) {
            try {
                fileE = n1h.e((Context) r6, "snapshot-output", ".png");
            } catch (IOException unused) {
                fileE = null;
            }
            if (fileE == null) {
                bujVar.a(2132021580);
                return;
            }
            uriFromFile = Uri.fromFile(fileE);
        } else {
            uriFromFile = uriFromFile2;
        }
        int i = OfaImageEditorActivity.e;
        Intent intent = new Intent((Context) r6, (Class<?>) OfaImageEditorActivity.class);
        intent.putExtra("theme_id", r6.a.a);
        intent.putExtra("follow_system_font", ozk.b(r6));
        intent.putExtra("input-uri", uriFromFile2);
        intent.putExtra("output", uriFromFile);
        intent.putExtra("output-watermark-strategy", (Parcelable) qnn.b);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(nsl.e);
        arrayList.add(nsl.f);
        arrayList.add(nsl.h);
        arrayList.add(nsl.i);
        arrayList.add(nsl.j);
        intent.putParcelableArrayListExtra("tools", arrayList);
        r6.D(intent, new g2b(bujVar, tnVar, uriFromFile));
        r6.overridePendingTransition(2130772050, 2130772051);
    }
}
