package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class oz5 implements FilenameFilter {
    public final /* synthetic */ byte a = 1;
    public final Pattern b;

    public oz5(Pattern pattern) {
        pattern.getClass();
        this.b = pattern;
    }

    public oz5(pz5 pz5Var, Pattern pattern) {
        this.b = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        byte b = this.a;
        Pattern pattern = this.b;
        switch (b) {
            case 0:
                return pattern.matcher(str).find();
            default:
                return pattern.matcher(str).matches();
        }
    }
}
