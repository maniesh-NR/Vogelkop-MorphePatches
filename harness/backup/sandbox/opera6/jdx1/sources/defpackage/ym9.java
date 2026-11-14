package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ym9 {
    public final ol9 a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public final ArrayList c = new ArrayList();
    public boolean j = true;
    public boolean r = false;

    public ym9(ol9 ol9Var, ClassLoader classLoader) {
        this.a = ol9Var;
        this.b = classLoader;
    }

    public final void b(xm9 xm9Var) {
        this.c.add(xm9Var);
        xm9Var.d = this.d;
        xm9Var.e = this.e;
        xm9Var.f = this.f;
        xm9Var.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            qp2.n("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.i = true;
            this.k = str;
        }
    }

    public final Fragment d(Class cls, Bundle bundle) {
        ol9 ol9Var = this.a;
        if (ol9Var == null) {
            qp2.n("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
            return null;
        }
        ClassLoader classLoader = this.b;
        if (classLoader == null) {
            qp2.n("The FragmentManager must be attached to itshost to create a Fragment");
            return null;
        }
        Fragment fragmentA = ol9Var.a(classLoader, cls.getName());
        if (bundle != null) {
            fragmentA.setArguments(bundle);
        }
        return fragmentA;
    }

    public abstract void e(int i, Fragment fragment, String str, int i2);
}
