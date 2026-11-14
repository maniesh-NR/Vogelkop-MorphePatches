package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class wa6 implements t39 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final qsh i;
    public final kjd j;
    public final Uri k;
    public final m4h l;
    public final List m;

    public wa6(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, m4h m4hVar, qsh qshVar, kjd kjdVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = m4hVar;
        this.i = qshVar;
        this.k = uri;
        this.j = kjdVar;
        this.m = arrayList;
    }

    public final j9g a(int i) {
        return (j9g) this.m.get(i);
    }

    public final long b(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((j9g) list.get(i)).b;
        } else {
            j = ((j9g) list.get(i + 1)).b;
            j2 = ((j9g) list.get(i)).b;
        }
        return j - j2;
    }

    public final long c(int i) {
        return tym.N(b(i));
    }

    @Override // defpackage.t39
    public final Object copy(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new zfk(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((zfk) linkedList.peek()).a != i) {
                long jB = b(i);
                if (jB != -9223372036854775807L) {
                    j2 += jB;
                }
            } else {
                j9g j9gVarA = a(i);
                List list2 = j9gVarA.c;
                zfk zfkVar = (zfk) linkedList.poll();
                int i2 = zfkVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = zfkVar.b;
                    jr jrVar = (jr) list2.get(i3);
                    List list3 = jrVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((evh) list3.get(zfkVar.c));
                        zfkVar = (zfk) linkedList.poll();
                        if (zfkVar.a != i2) {
                            break;
                        }
                    } while (zfkVar.b == i3);
                    j = j2;
                    arrayList2.add(new jr(jrVar.a, jrVar.b, arrayList3, jrVar.d, jrVar.e, jrVar.f));
                    if (zfkVar.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(zfkVar);
                arrayList.add(new j9g(j9gVarA.a, j9gVarA.b - j, arrayList2, j9gVarA.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new wa6(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }
}
