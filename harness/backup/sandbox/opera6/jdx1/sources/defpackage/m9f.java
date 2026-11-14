package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m9f implements ur3, kw1, a1n {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int a;
    public int b;
    public Object c;

    public /* synthetic */ m9f(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public m9f(int i, int i2, vq7 vq7Var) {
        this.a = i;
        this.b = i2;
        this.c = new w7j(new x89(i, i2, vq7Var));
    }

    public m9f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), shh.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new so5().d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public m9f(View view, int i) {
        this.c = view;
        this.a = i;
        view.setOutlineProvider(new tk4(this, (byte) 2));
        view.setClipToOutline(true);
    }

    public m9f(ViewGroup viewGroup) throws Resources.NotFoundException {
        this.b = 1;
        this.c = viewGroup;
        h();
        viewGroup.setTag(2131364449, this);
    }

    public /* synthetic */ m9f(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public m9f(q0 q0Var, int i) {
        this.c = q0Var;
        this.a = i;
        int iFloor = ((int) Math.floor((j14.n(r0 * 15) - 1) / (j14.n(16) - 1))) + 1 + ((int) Math.ceil((i << 3) / (j14.n(16) - 1)));
        this.b = iFloor;
        String strB = x87.b(q0Var);
        if (((ein) ein.d.get(s75.d(i, iFloor, strB))) != null) {
            return;
        }
        qp2.o("cannot find OID for digest algorithm: ".concat(strB));
        throw null;
    }

    public static int d(Context context) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = context.getResources();
        Rect rectI = r9n.i(context);
        int iWidth = rectI.width();
        int iHeight = rectI.height();
        if (ddh.s(iHeight, context) == gpj.a && iHeight < iWidth) {
            return resources.getDimensionPixelSize(2131167396);
        }
        int iOrdinal = ddh.t(iWidth, context).ordinal();
        if (iOrdinal == 0) {
            return resources.getDimensionPixelSize(2131167394);
        }
        if (iOrdinal != 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131167395);
            dimensionPixelSize2 = resources.getDimensionPixelSize(2131167392);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(2131167397);
            dimensionPixelSize2 = resources.getDimensionPixelSize(2131167393);
        }
        return Math.max(dimensionPixelSize, Math.max(0, (iWidth - dimensionPixelSize2) / 2));
    }

    public static void x(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(fac.l(i2));
    }

    @Override // defpackage.ur3
    public final int a() {
        return this.a;
    }

    public final int e() {
        if (this.b == 2) {
            return 0;
        }
        return this.a;
    }

    public final void f() throws Resources.NotFoundException {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view = viewGroup;
        while (true) {
            if (view != viewGroup && view.getTag(2131364449) != null) {
                i = 2;
                break;
            } else if (view.getTag(2131364448) != null) {
                h9o.t();
                return;
            } else {
                if (!(view.getParent() instanceof View)) {
                    i = 0;
                    break;
                }
                view = (View) view.getParent();
            }
        }
        if (i != 0) {
            this.b = i;
        }
        h();
    }

    @Override // defpackage.a1n
    public final int g() {
        return this.b;
    }

    @Override // defpackage.ur3
    public final int getSampleCount() {
        return this.b;
    }

    public final void h() throws Resources.NotFoundException {
        ViewGroup viewGroup = (ViewGroup) this.c;
        int iD = d(viewGroup.getContext());
        if (this.a == iD) {
            return;
        }
        this.a = iD;
        viewGroup.requestLayout();
    }

    @Override // defpackage.kw1
    public final Object i() {
        return ((kw1) this.c).i();
    }

    @Override // defpackage.kw1
    public final void j(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((kw1) this.c).j(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.kw1
    public final void k(int i, int i2) {
        ((kw1) this.c).k(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.kw1
    public final void l(Object obj, Function2 function2) {
        ((kw1) this.c).l(obj, function2);
    }

    @Override // defpackage.kw1
    public final void m(int i, Object obj) {
        ((kw1) this.c).m(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.a1n
    public final int o() {
        return this.a;
    }

    @Override // defpackage.kw1
    public final void p(int i, Object obj) {
        ((kw1) this.c).p(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.kw1
    public final void r(Object obj) {
        this.b++;
        ((kw1) this.c).r(obj);
    }

    @Override // defpackage.ur3
    public final int readNextSampleSize() {
        int i = this.a;
        return i == -1 ? ((g1g) this.c).E() : i;
    }

    @Override // defpackage.kw1
    public final void s() {
        ((kw1) this.c).s();
    }

    @Override // defpackage.y0n
    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.c).t(j, if1Var, if1Var2, if1Var3);
    }

    @Override // defpackage.kw1
    public final void u() {
        if (this.b <= 0) {
            mh5.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((kw1) this.c).u();
    }

    public final void v(float f) {
        int i = (int) (f * this.a);
        if (i == this.b) {
            return;
        }
        this.b = i;
        ((View) this.c).invalidateOutline();
    }

    @Override // defpackage.y0n
    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((w7j) this.c).w(j, if1Var, if1Var2, if1Var3);
    }
}
