package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tud implements z6g, x3a {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final sud e;

    public tud(sud sudVar) {
        this.e = sudVar;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            z6g z6gVar = (z6g) arrayList.get(size);
            if (z6gVar instanceof hq5) {
                hq5 hq5Var = (hq5) z6gVar;
                ArrayList arrayList2 = (ArrayList) hq5Var.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathE = ((z6g) arrayList2.get(size2)).e();
                    Matrix matrixE = hq5Var.a;
                    ev7 ev7Var = hq5Var.i;
                    if (ev7Var != null) {
                        matrixE = ev7Var.e();
                    } else {
                        matrixE.reset();
                    }
                    pathE.transform(matrixE);
                    path.addPath(pathE);
                }
            } else {
                path.addPath(z6gVar.e());
            }
        }
        int i = 0;
        z6g z6gVar2 = (z6g) arrayList.get(0);
        if (z6gVar2 instanceof hq5) {
            hq5 hq5Var2 = (hq5) z6gVar2;
            List listG = hq5Var2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listG;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathE2 = ((z6g) arrayList3.get(i)).e();
                Matrix matrixE2 = hq5Var2.a;
                ev7 ev7Var2 = hq5Var2.i;
                if (ev7Var2 != null) {
                    matrixE2 = ev7Var2.e();
                } else {
                    matrixE2.reset();
                }
                pathE2.transform(matrixE2);
                path2.addPath(pathE2);
                i++;
            }
        } else {
            path2.set(z6gVar2.e());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((z6g) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.z6g
    public final Path e() {
        Path path = this.c;
        path.reset();
        sud sudVar = this.e;
        if (!sudVar.b) {
            int iA = vep.A(sudVar.a);
            if (iA == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((z6g) arrayList.get(i)).e());
                    i++;
                }
            } else {
                if (iA == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iA == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iA == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iA == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // defpackage.x3a
    public final void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            wp5 wp5Var = (wp5) listIterator.previous();
            if (wp5Var instanceof z6g) {
                this.d.add((z6g) wp5Var);
                listIterator.remove();
            }
        }
    }
}
