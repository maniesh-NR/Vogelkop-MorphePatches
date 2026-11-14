package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g7l implements f7l {
    public final zyk a;

    public g7l() {
        this.a = z4c.b(new thk((byte) 10));
    }

    public g7l(SettingsManager settingsManager) {
        this.a = z4c.b(new s99(settingsManager, (byte) 2));
    }

    @Override // defpackage.f7l
    public final Uri d(String str) {
        return Uri.fromFile(new File((File) this.a.getValue(), str));
    }

    @Override // defpackage.f7l
    public final void g(LinkedHashSet linkedHashSet) {
        zyk zykVar;
        ArrayList arrayList = new ArrayList(k95.o(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zykVar = this.a;
            if (!zHasNext) {
                break;
            }
            arrayList.add(new File((File) zykVar.getValue(), (String) it.next()));
        }
        File[] fileArrListFiles = ((File) zykVar.getValue()).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!arrayList.contains(file)) {
                    file.delete();
                }
            }
        }
    }

    @Override // defpackage.f7l
    public final void i(String str, Bitmap bitmap) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File((File) this.a.getValue(), str));
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream)) {
                throw new IOException("compress failed");
            }
            fileOutputStream.close();
        } finally {
        }
    }

    @Override // defpackage.f7l
    public final void remove(String str) {
        new File((File) this.a.getValue(), str).delete();
    }
}
