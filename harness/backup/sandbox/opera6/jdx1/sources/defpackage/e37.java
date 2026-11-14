package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class e37 implements z27 {
    public final f1o d;
    public int f;
    public int g;
    public f1o a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public h97 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public e37(f1o f1oVar) {
        this.d = f1oVar;
    }

    @Override // defpackage.z27
    public final void a(z27 z27Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((e37) obj).j) {
                return;
            }
        }
        this.c = true;
        f1o f1oVar = this.a;
        if (f1oVar != null) {
            f1oVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        e37 e37Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            e37 e37Var2 = (e37) obj2;
            if (!(e37Var2 instanceof h97)) {
                i++;
                e37Var = e37Var2;
            }
        }
        if (e37Var != null && i == 1 && e37Var.j) {
            h97 h97Var = this.i;
            if (h97Var != null) {
                if (!h97Var.j) {
                    return;
                } else {
                    this.f = this.h * h97Var.g;
                }
            }
            d(e37Var.g + this.f);
        }
        f1o f1oVar2 = this.a;
        if (f1oVar2 != null) {
            f1oVar2.a(this);
        }
    }

    public final void b(f1o f1oVar) {
        this.k.add(f1oVar);
        if (this.j) {
            f1oVar.a(f1oVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z27 z27Var = (z27) obj;
            z27Var.a(z27Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
