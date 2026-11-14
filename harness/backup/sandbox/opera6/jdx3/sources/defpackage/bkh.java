package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;

/* loaded from: classes.dex */
public final class bkh extends dd7 {
    public File a;

    public bkh(File file) {
        this.a = file;
    }

    public static boolean l(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zL = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zL &= l(file2);
                }
                if (!file2.delete()) {
                    file2.toString();
                    zL = false;
                }
            }
        }
        return zL;
    }

    @Override // defpackage.dd7
    public final boolean a() {
        return this.a.canRead();
    }

    @Override // defpackage.dd7
    public final boolean b() {
        return this.a.canWrite();
    }

    @Override // defpackage.dd7
    public final boolean c() {
        l(this.a);
        return this.a.delete();
    }

    @Override // defpackage.dd7
    public final boolean d() {
        return this.a.exists();
    }

    @Override // defpackage.dd7
    public final String g() {
        return this.a.getName();
    }

    @Override // defpackage.dd7
    public final String h() {
        if (this.a.isDirectory()) {
            return null;
        }
        String name = this.a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // defpackage.dd7
    public final Uri i() {
        return Uri.fromFile(this.a);
    }

    @Override // defpackage.dd7
    public final long j() {
        return this.a.length();
    }

    @Override // defpackage.dd7
    public final boolean k(String str) {
        File file = new File(this.a.getParentFile(), str);
        if (!this.a.renameTo(file)) {
            return false;
        }
        this.a = file;
        return true;
    }
}
