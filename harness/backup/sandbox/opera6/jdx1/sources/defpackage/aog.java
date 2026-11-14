package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aog extends d4 {
    public static final m3g A = new m3g((byte) 18);
    public Function0 h;
    public gog i;
    public final View j;
    public final boolean k;
    public final s16 l;
    public final WindowManager m;
    public final WindowManager.LayoutParams n;
    public fog o;
    public d2c p;
    public final t0g q;
    public final t0g r;
    public ccb s;
    public final i37 t;
    public final Rect u;
    public final tuj v;
    public wi w;
    public final t0g x;
    public boolean y;
    public final int[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aog(Function0 function0, gog gogVar, View view, n27 n27Var, fog fogVar, UUID uuid, boolean z) {
        super(view.getContext());
        s16 bogVar = Build.VERSION.SDK_INT >= 30 ? new bog() : new s16();
        this.h = function0;
        this.i = gogVar;
        this.j = view;
        this.k = z;
        this.l = bogVar;
        this.m = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        gog gogVar2 = this.i;
        boolean zC = w91.c(view);
        boolean z2 = gogVar2.b;
        int i = gogVar2.a;
        if (z2) {
            if (zC) {
                i |= 8192;
            } else if (!zC) {
                i &= -8193;
            }
        }
        layoutParams.flags = i;
        layoutParams.type = this.i.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(2132018529));
        this.n = layoutParams;
        this.o = fogVar;
        this.p = d2c.a;
        this.q = hyg.k((Object) null);
        this.r = hyg.k((Object) null);
        this.t = luj.b(new d8e(this, (byte) 19));
        this.u = new Rect();
        this.v = new tuj(new p91(this, (byte) 2));
        setId(R.id.content);
        setTag(2131365017, z7h.j(view));
        setTag(2131365021, w8h.k(view));
        setTag(2131365020, b8h.e(view));
        setTag(2131362390, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(n27Var.o0(8.0f));
        setOutlineProvider(new zq3((byte) 4));
        this.x = hyg.k(uup.b);
        this.z = new int[2];
    }

    @Override // defpackage.d4
    public final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-857613600);
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.x.getValue()).invoke(vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a7b(this, i, (byte) 25);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.i.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.h;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.d4
    public final boolean g() {
        return this.y;
    }

    @Override // defpackage.d4
    public final void h(int i, int i2, int i3, int i4, boolean z) {
        super.h(i, i2, i3, i4, z);
        this.i.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.n;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.l.getClass();
        this.m.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.d4
    public final void i(int i, int i2) {
        this.i.getClass();
        ccb ccbVarO = o();
        super.i(View.MeasureSpec.makeMeasureSpec(ccbVarO.d(), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(ccbVarO.b(), LinearLayoutManager.INVALID_OFFSET));
    }

    public final ccb o() {
        int i = this.i.a & NotificationCompat.FLAG_GROUP_SUMMARY;
        View view = this.j;
        Rect rect = this.u;
        s16 s16Var = this.l;
        if (i == 0) {
            s16Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            s16Var.r(rect, view);
        }
        return new ccb(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.d4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.f();
        if (!this.i.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        wi wiVar = this.w;
        if (wiVar == null) {
            wi wiVar2 = new wi(this.h, (byte) 1);
            this.w = wiVar2;
            wiVar = wiVar2;
        }
        t8.K(this, wiVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tuj tujVar = this.v;
        txi txiVar = (txi) tujVar.j;
        if (txiVar != null) {
            txiVar.d();
        }
        tujVar.c();
        if (Build.VERSION.SDK_INT >= 33) {
            t8.L(this, this.w);
        }
        this.w = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.i.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.h;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function02 = this.h;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return true;
    }

    public final void p(Function0 function0, gog gogVar, d2c d2cVar) {
        int i;
        this.h = function0;
        if (!Intrinsics.a(this.i, gogVar)) {
            gogVar.getClass();
            this.i = gogVar;
            boolean zC = w91.c(this.j);
            boolean z = gogVar.b;
            int i2 = gogVar.a;
            if (z) {
                if (zC) {
                    i2 |= 8192;
                } else if (!zC) {
                    i2 &= -8193;
                }
            }
            WindowManager.LayoutParams layoutParams = this.n;
            layoutParams.flags = i2;
            this.l.getClass();
            this.m.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = d2cVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void q() {
        b2c b2cVar = (b2c) this.r.getValue();
        if (b2cVar != null) {
            if (!b2cVar.f()) {
                b2cVar = null;
            }
            if (b2cVar != null) {
                long jH = b2cVar.h();
                long jK = this.k ? b2cVar.K(0L) : b2cVar.B(0L);
                ccb ccbVarC = f03.c((Math.round(Float.intBitsToFloat((int) (jK >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jK & 4294967295L))) & 4294967295L), jH);
                if (ccbVarC.equals(this.s)) {
                    return;
                }
                this.s = ccbVarC;
                r();
            }
        }
    }

    public final void r() {
        gcb gcbVar;
        final ccb ccbVar = this.s;
        if (ccbVar == null || (gcbVar = (gcb) this.q.getValue()) == null) {
            return;
        }
        final long j = gcbVar.a;
        ccb ccbVarO = o();
        final long jB = (ccbVarO.b() & 4294967295L) | (ccbVarO.d() << 32);
        final oqh oqhVar = new oqh();
        oqhVar.a = 0L;
        this.v.e(this, A, new Function0() { // from class: zng
            public final Object invoke() {
                aog aogVar = this;
                oqhVar.a = aogVar.o.b(ccbVar, jB, aogVar.p, j);
                return Unit.a;
            }
        });
        long j2 = oqhVar.a;
        WindowManager.LayoutParams layoutParams = this.n;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.i.e;
        s16 s16Var = this.l;
        if (z) {
            s16Var.getClass();
            setSystemGestureExclusionRects(j95.j(new Rect[]{new Rect(0, 0, (int) (jB >> 32), (int) (jB & 4294967295L))}));
        }
        s16Var.getClass();
        this.m.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}
