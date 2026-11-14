package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.custom_views.FadingTextView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.widget.UrlFieldEditText;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class vr3 implements pri {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public vr3(TextView textView) {
        this.d = new ArrayList();
        this.a = 1;
        this.c = textView;
        this.b = l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vr3(UrlFieldEditText urlFieldEditText) {
        this.c = urlFieldEditText;
        this.a = urlFieldEditText.getHighlightColor();
        jq3 jq3Var = new jq3(this, (byte) 8);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        valueAnimatorOfFloat.addUpdateListener(jq3Var);
        valueAnimatorOfFloat.setInterpolator(lf1.f);
        valueAnimatorOfFloat.setDuration(100L);
        this.d = valueAnimatorOfFloat;
    }

    public vr3(Callback callback) {
        this.c = callback;
        this.d = new ArrayList();
    }

    public vr3(v0k v0kVar) {
        this(v0kVar, false, ot4.f, Integer.MAX_VALUE);
    }

    public vr3(v0k v0kVar, boolean z, ot4 ot4Var, int i) {
        this.d = v0kVar;
        this.b = z;
        this.c = ot4Var;
        this.a = i;
    }

    public static vr3 i(char c) {
        return new vr3(new txi(new st4((byte) 0, c), (byte) 14));
    }

    public static vr3 j(String str) {
        z4o.v("The separator may not be the empty string.", !str.isEmpty());
        return str.length() == 1 ? i(str.charAt(0)) : new vr3(new jp5(str, (byte) 9));
    }

    @Override // defpackage.pri
    public final Suggestion a(dri driVar, int i) {
        dri driVar2 = driVar;
        byte b = driVar2.a;
        String str = driVar2.b;
        String str2 = (b == 0 || !(b == 1 || b == 2)) ? str : driVar2.c;
        int length = str2.length();
        byte b2 = driVar2.a;
        if (!h(length, b2)) {
            if (b2 == 0 || !h(str2.length(), 0)) {
                driVar2 = null;
            } else if (b2 != 0) {
                driVar2 = new dri(str, "", "", "", 0, 0, "");
            }
        }
        if (driVar2 == null) {
            return null;
        }
        byte b3 = driVar2.a;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        sparseIntArray.put(b3, sparseIntArray.get(b3) + 1);
        String str3 = driVar2.b;
        String str4 = (b3 == 0 || !(b3 == 1 || b3 == 2)) ? str3 : driVar2.c;
        if (b3 == 0) {
            return new Suggestion(8, str4, "", str3, null, null, i, "", 0, -1, null);
        }
        if (b3 != 1) {
            return b3 != 2 ? new Suggestion(8, str4, "", str3, null, null, i, "", 0, -1, null) : new Suggestion(19, str4, "", str3, null, null, i, "", 0, -1, null);
        }
        return new Suggestion(18, str4, driVar2.d, driVar2.e, null, str3, i, driVar2.f, driVar2.g, -1, null);
    }

    public final tt2 b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        arrayList.add(null);
        this.a++;
        return new tt2((Object) this, size, (byte) 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        TextView textView = (TextView) this.c;
        if (this.a == 1) {
            return;
        }
        int gravity = textView.getGravity();
        if (this.a != 1) {
            gravity = (gravity & (-8388616)) | e(this.a, ((lgl) textView).l());
        }
        textView.setGravity(gravity);
    }

    public final void d() {
        this.b = true;
        if (this.a == 0) {
            ((Callback) this.c).run(CollectionsKt.k0((ArrayList) this.d));
        }
    }

    public final int e(int i, boolean z) {
        if (i == 2) {
            return e(z == this.b ? 5 : 6, z);
        }
        if (i == 3) {
            return e(z != this.b ? 5 : 6, z);
        }
        if (i == 5) {
            return z ? 5 : 3;
        }
        if (i != 6) {
            return 0;
        }
        return z ? 3 : 5;
    }

    public final void f() {
        ViewGroup viewGroup = (ViewGroup) this.c;
        if (viewGroup == null) {
            return;
        }
        if (!this.b) {
            this.d = viewGroup.findFocus();
            ((ViewGroup) this.c).setDescendantFocusability(393216);
            return;
        }
        viewGroup.setDescendantFocusability(131072);
        View view = (View) this.d;
        if (view == null || !q9n.w((ViewGroup) this.c, view)) {
            ((ViewGroup) this.c).requestFocus();
        } else {
            ((View) this.d).requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(AttributeSet attributeSet, int i) {
        TextView textView = (TextView) this.c;
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, mhh.b, i, 0);
        int i2 = this.a;
        int integer = typedArrayObtainStyledAttributes.getInteger(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        if (i2 == integer) {
            return;
        }
        if (this.a != integer) {
            this.a = integer;
            int gravity = textView.getGravity();
            if (this.a != 1) {
                gravity = (gravity & (-8388616)) | e(this.a, ((lgl) textView).l());
            }
            textView.setGravity(gravity);
        }
        c();
    }

    public final boolean h(int i, int i2) {
        qri qriVar = (qri) ((SparseArray) this.c).get(i2);
        if (qriVar == null) {
            return false;
        }
        if (this.b && !qriVar.e) {
            return false;
        }
        byte b = qriVar.b;
        int i3 = qriVar.c;
        int i4 = this.a;
        return b <= i4 && i4 <= i3 && i <= qriVar.d && ((SparseIntArray) this.d).get(i2) < qriVar.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.custom_views.FadingTextView, com.opera.android.custom_views.StylingTextView] */
    public final void k() {
        int i;
        boolean zL = l();
        if (zL != this.b) {
            this.b = zL;
            int i2 = this.a;
            if (i2 == 2 || i2 == 3) {
                c();
            }
            ArrayList arrayList = (ArrayList) this.d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ?? r3 = (FadingTextView) obj;
                r3.m = null;
                cs5.W((View) r3);
                int dimension = (int) r3.getResources().getDimension(2131165702);
                if (r3.l.b) {
                    i = dimension;
                    dimension = 0;
                } else {
                    i = 0;
                }
                r3.setPadding(dimension, 0, i, 0);
            }
        }
    }

    public final boolean l() {
        TextView textView = (TextView) this.c;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return false;
        }
        String string = textView.getText().toString();
        Context context = textView.getContext();
        int iJ = cs5.J(string);
        if (iJ == 2) {
            iJ = l2c.a(context);
        }
        return iJ == 1;
    }

    public final e5d m(CharSequence charSequence) {
        charSequence.getClass();
        return new e5d(this, charSequence, (byte) 4);
    }

    public final List n(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = ((v0k) this.d).f(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            u0k u0kVar = (u0k) itF;
            if (!u0kVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) u0kVar.next());
        }
    }
}
