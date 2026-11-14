package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class zuk implements kr9 {
    public static final zuk a = new zuk();

    public final br9 a() {
        return new nr9(1, k1g.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final i16 b(v04 v04Var) throws IOException {
        InputStream inputStreamF1 = v04Var.F1();
        sgi sgiVar = new sgi();
        sgiVar.e = null;
        sgiVar.f = null;
        sgiVar.a = false;
        sgiVar.c = false;
        sgiVar.g = null;
        sgiVar.h = null;
        sgiVar.d = false;
        sgiVar.i = null;
        if (!inputStreamF1.markSupported()) {
            inputStreamF1 = new BufferedInputStream(inputStreamF1);
        }
        try {
            inputStreamF1.mark(3);
            int i = inputStreamF1.read() + (inputStreamF1.read() << 8);
            inputStreamF1.reset();
            if (i == 35615) {
                inputStreamF1 = new BufferedInputStream(new GZIPInputStream(inputStreamF1));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamF1.mark(4096);
            sgiVar.C(inputStreamF1);
            return new i16((p8f) sgiVar.e, (byte) 4);
        } finally {
            try {
                inputStreamF1.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zuk) && (obj instanceof kr9)) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
