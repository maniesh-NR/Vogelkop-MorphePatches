package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class o3b implements FilenameFilter {
    public final /* synthetic */ byte a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return c.l(str, ".html", false);
            case 1:
                return str.endsWith(".mhtml");
            default:
                return str.startsWith("s") && !"StoredAds.txt".equals(str);
        }
    }
}
