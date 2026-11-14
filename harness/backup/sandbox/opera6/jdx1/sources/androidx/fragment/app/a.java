package androidx.fragment.app;

import androidx.core.app.NotificationCompat;
import defpackage.bm9;
import defpackage.dzc;
import defpackage.ol9;
import defpackage.p3p;
import defpackage.ql9;
import defpackage.vm9;
import defpackage.xm9;
import defpackage.ym9;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends ym9 implements bm9 {
    public final w t;
    public boolean u;
    public int v;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(w wVar) {
        ol9 ol9VarL = wVar.L();
        ql9 ql9Var = wVar.x;
        super(ol9VarL, ql9Var != null ? ql9Var.b.getClassLoader() : null);
        this.v = -1;
        this.t = wVar;
    }

    @Override // defpackage.bm9
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.N(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.d.add(this);
        return true;
    }

    @Override // defpackage.ym9
    public final void e(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            vm9.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            qp2.j(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                qp2.n(p3p.n(sb, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                s49.q("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new xm9(fragment, i2));
        fragment.mFragmentManager = this.t;
    }

    public final void f(int i) {
        if (this.i) {
            if (w.N(2)) {
                toString();
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xm9 xm9Var = (xm9) arrayList.get(i2);
                Fragment fragment = xm9Var.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (w.N(2)) {
                        Objects.toString(xm9Var.b);
                        int i3 = xm9Var.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            xm9 xm9Var = (xm9) arrayList.get(size);
            if (xm9Var.c) {
                if (xm9Var.a == 8) {
                    xm9Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = xm9Var.b.mContainerId;
                    xm9Var.a = 2;
                    xm9Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        xm9 xm9Var2 = (xm9) arrayList.get(i2);
                        if (xm9Var2.c && xm9Var2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int h() {
        return i(false, true);
    }

    public final int i(boolean z, boolean z2) {
        if (this.u) {
            qp2.n("commit already called");
            return 0;
        }
        if (w.N(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new dzc());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.u = true;
        boolean z3 = this.i;
        w wVar = this.t;
        if (z3) {
            this.v = wVar.k.getAndIncrement();
        } else {
            this.v = -1;
        }
        if (z2) {
            wVar.y(this, z);
        }
        return this.v;
    }

    public final a j(Fragment fragment) {
        w wVar = fragment.mFragmentManager;
        if (wVar == null || wVar == this.t) {
            b(new xm9(fragment, 6));
            return this;
        }
        qp2.f(fragment, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xm9 xm9Var = (xm9) arrayList.get(i);
            switch (xm9Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + xm9Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(xm9Var.b);
            if (z) {
                if (xm9Var.d != 0 || xm9Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(xm9Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(xm9Var.e));
                }
                if (xm9Var.f != 0 || xm9Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(xm9Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(xm9Var.g));
                }
            }
        }
    }

    public final a l(Fragment fragment) {
        w wVar = fragment.mFragmentManager;
        if (wVar == null || wVar == this.t) {
            b(new xm9(fragment, 4));
            return this;
        }
        qp2.f(fragment, "Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a m(Fragment fragment) {
        w wVar = fragment.mFragmentManager;
        if (wVar == null || wVar == this.t) {
            b(new xm9(fragment, 3));
            return this;
        }
        qp2.f(fragment, "Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a n(axa axaVar) {
        w wVar = axaVar.mFragmentManager;
        if (wVar == null || wVar == this.t) {
            b(new xm9(axaVar, 8));
            return this;
        }
        qp2.f(axaVar, "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final a o(Fragment fragment) {
        w wVar = fragment.mFragmentManager;
        if (wVar == null || wVar == this.t) {
            b(new xm9(fragment, 5));
            return this;
        }
        qp2.f(fragment, "Cannot show Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
