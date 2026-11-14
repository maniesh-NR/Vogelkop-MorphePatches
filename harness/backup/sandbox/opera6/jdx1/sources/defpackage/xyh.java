package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class xyh extends g29 {
    public static final w6g d;
    public final ClassLoader a;
    public final g29 b;
    public final zyk c;

    static {
        String str = w6g.b;
        d = s16.o("/", false);
    }

    public xyh(ClassLoader classLoader) {
        g29 g29Var = g29.SYSTEM;
        this.a = classLoader;
        this.b = g29Var;
        this.c = z4c.b(new d8e(this, (byte) 28));
    }

    public static String h(w6g w6gVar) {
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        return f.a(w6gVar2, w6gVar, true).d(w6gVar2).a.w();
    }

    public final nmj appendingSink(w6g w6gVar, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public final void atomicMove(w6g w6gVar, w6g w6gVar2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public final w6g canonicalize(w6g w6gVar) {
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        return f.a(w6gVar2, w6gVar, true);
    }

    public final void createSymlink(w6g w6gVar, w6g w6gVar2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public final void delete(w6g w6gVar, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public final List list(w6g w6gVar) {
        String strH = h(w6gVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.c.getValue()) {
            g29 g29Var = (g29) pair.a;
            w6g w6gVar2 = (w6g) pair.b;
            try {
                List list = g29Var.list(w6gVar2.e(strH));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (hn9.o((w6g) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(hn9.s((w6g) obj2, w6gVar2));
                }
                o95.t(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.k0(linkedHashSet);
        }
        yt7.f(o18.n(w6gVar, "file not found: "));
        return null;
    }

    public final List listOrNull(w6g w6gVar) {
        String strH = h(w6gVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.c.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            g29 g29Var = (g29) pair.a;
            w6g w6gVar2 = (w6g) pair.b;
            List listListOrNull = g29Var.listOrNull(w6gVar2.e(strH));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (hn9.o((w6g) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(hn9.s((w6g) obj2, w6gVar2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                o95.t(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt.k0(linkedHashSet);
        }
        return null;
    }

    public final p19 metadataOrNull(w6g w6gVar) {
        if (!hn9.o(w6gVar)) {
            return null;
        }
        String strH = h(w6gVar);
        for (Pair pair : (List) this.c.getValue()) {
            p19 p19VarMetadataOrNull = ((g29) pair.a).metadataOrNull(((w6g) pair.b).e(strH));
            if (p19VarMetadataOrNull != null) {
                return p19VarMetadataOrNull;
            }
        }
        return null;
    }

    public final i19 openReadOnly(w6g w6gVar) {
        if (!hn9.o(w6gVar)) {
            yt7.f(o18.n(w6gVar, "file not found: "));
            return null;
        }
        String strH = h(w6gVar);
        Iterator it = ((List) this.c.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((g29) pair.a).openReadOnly(((w6g) pair.b).e(strH));
            } catch (FileNotFoundException unused) {
            }
        }
        yt7.f(o18.n(w6gVar, "file not found: "));
        return null;
    }

    public final i19 openReadWrite(w6g w6gVar, boolean z, boolean z2) throws IOException {
        throw new IOException("resources are not writable");
    }

    public final nmj sink(w6g w6gVar, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public final ewj source(w6g w6gVar) throws IOException {
        if (!hn9.o(w6gVar)) {
            yt7.f(o18.n(w6gVar, "file not found: "));
            return null;
        }
        w6g w6gVar2 = d;
        w6gVar2.getClass();
        URL resource = this.a.getResource(f.a(w6gVar2, w6gVar, false).d(w6gVar2).a.w());
        if (resource == null) {
            yt7.f(o18.n(w6gVar, "file not found: "));
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        return o0g.A0(uRLConnectionOpenConnection.getInputStream());
    }
}
