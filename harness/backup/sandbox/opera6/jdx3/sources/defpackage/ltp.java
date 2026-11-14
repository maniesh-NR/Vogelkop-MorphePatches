package defpackage;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class ltp implements FileFilter {
    public static final /* synthetic */ ltp b = new ltp(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ ltp(byte b2) {
        this.a = b2;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (file.isDirectory() && !file.isHidden() && file.canWrite() && file.canRead()) {
                    break;
                }
                break;
            default:
                if (!file.getName().equals("index") && !file.getName().equals("index-dir")) {
                    break;
                }
                break;
        }
        return true;
    }
}
