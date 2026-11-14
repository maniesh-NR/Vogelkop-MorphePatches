package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class zco extends g29 {
    public static final w6g d;
    public final w6g a;
    public final g29 b;
    public final LinkedHashMap c;

    static {
        String str = w6g.b;
        d = s16.o("/", false);
    }

    public zco(w6g w6gVar, g29 g29Var, LinkedHashMap linkedHashMap) {
        this.a = w6gVar;
        this.b = g29Var;
        this.c = linkedHashMap;
    }

    public final nmj appendingSink(w6g w6gVar, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void atomicMove(w6g w6gVar, w6g w6gVar2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final w6g canonicalize(w6g w6gVar) throws FileNotFoundException {
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        w6g w6gVarA = f.a(w6gVar2, w6gVar, true);
        if (this.c.containsKey(w6gVarA)) {
            return w6gVarA;
        }
        throw new FileNotFoundException(String.valueOf(w6gVar));
    }

    public final void createDirectory(w6g w6gVar, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void createSymlink(w6g w6gVar, w6g w6gVar2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void delete(w6g w6gVar, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final List h(w6g w6gVar, boolean z) {
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        yco ycoVar = (yco) this.c.get(f.a(w6gVar2, w6gVar, true));
        if (ycoVar != null) {
            return CollectionsKt.k0(ycoVar.q);
        }
        if (!z) {
            return null;
        }
        s49.m(o18.n(w6gVar, "not a directory: "));
        return null;
    }

    public final List list(w6g w6gVar) {
        return h(w6gVar, true);
    }

    public final List listOrNull(w6g w6gVar) {
        return h(w6gVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p19 metadataOrNull(w6g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zco.metadataOrNull(w6g):p19");
    }

    public final i19 openReadOnly(w6g w6gVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public final i19 openReadWrite(w6g w6gVar, boolean z, boolean z2) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    public final nmj sink(w6g w6gVar, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final ewj source(w6g w6gVar) throws Throwable {
        Throwable th;
        tlh tlhVar;
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        yco ycoVar = (yco) this.c.get(f.a(w6gVar2, w6gVar, true));
        if (ycoVar == null) {
            yt7.f(o18.n(w6gVar, "no such file: "));
            return null;
        }
        long j = ycoVar.f;
        i19 i19VarOpenReadOnly = this.b.openReadOnly(this.a);
        try {
            tlhVar = new tlh(i19VarOpenReadOnly.p(ycoVar.h));
            try {
                i19VarOpenReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (i19VarOpenReadOnly != null) {
                try {
                    i19VarOpenReadOnly.close();
                } catch (Throwable th4) {
                    wf8.a(th3, th4);
                }
            }
            th = th3;
            tlhVar = null;
        }
        if (th != null) {
            throw th;
        }
        upj.x(tlhVar, null);
        return ycoVar.g == 0 ? new eec(tlhVar, j, false) : new eec(new e7b(new eec(tlhVar, ycoVar.e, false), new Inflater(true)), j, true);
    }
}
