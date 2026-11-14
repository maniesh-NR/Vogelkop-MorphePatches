package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.OverlayView;
import com.opera.android.favorites.FavoriteFolderRootView;
import com.opera.android.favorites.FavoriteGridLayoutManager;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ar8 extends k24 implements TextView.OnEditorActionListener, sj7 {
    public izj A;
    public boolean B;
    public final i3j g;
    public final r9i h;
    public final o63 i;
    public final vq8 j;
    public final jvj k;
    public boolean n;
    public FavoriteFolderRootView o;
    public View p;
    public OverlayView q;
    public tq8 r;
    public final tq8 s;
    public zq8 u;
    public RecyclerView v;
    public View w;
    public FavoriteGridLayoutManager x;
    public ns8 y;
    public o28 z;
    public final a83 f = new a83((Object) this, (byte) 6);
    public final tv3 l = new tv3(this, (byte) 1);
    public boolean m = true;
    public final wq8 t = new wq8(this, 0);

    public ar8(i3j i3jVar, r9i r9iVar, tq8 tq8Var, vq8 vq8Var, x77 x77Var, jvj jvjVar) {
        this.r = tq8Var;
        this.s = tq8Var.b;
        this.g = i3jVar;
        this.h = r9iVar;
        skm skmVar = (skm) x77Var.c;
        this.i = ((tq8) x77Var.b) instanceof kdh ? new xdh((qdh) x77Var.d, skmVar) : new jr8(skmVar);
        this.j = vq8Var;
        this.k = jvjVar;
    }

    @Override // defpackage.sj7
    public final void c(i iVar) {
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        o0();
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558721, viewGroup, false);
        WeakHashMap weakHashMap = r5n.a;
        FavoriteFolderRootView favoriteFolderRootView = (FavoriteFolderRootView) ((View) m5n.f(viewInflate, 2131364107));
        this.o = favoriteFolderRootView;
        favoriteFolderRootView.b = this.g;
        byte b = 4;
        favoriteFolderRootView.setOnClickListener(new ic(this, b));
        this.o.setFocusable(false);
        Bundle arguments = getArguments();
        this.p = this.o.findViewById(2131362414);
        this.v = q9n.y(2131363007, this.o);
        this.w = (View) m5n.f(this.o, 2131364777);
        this.q = (OverlayView) ((View) m5n.f(viewInflate, 2131363802));
        yq8 yq8Var = new yq8(this, this.p);
        boolean z = arguments.getBoolean("editable");
        this.z = new o28(yq8Var);
        tta ttaVar = (tta) this.A.d.g();
        o28 o28Var = this.z;
        vq8 vq8Var = this.j;
        tq8 tq8Var = (tq8) vq8Var.b;
        ns8 sdhVar = tq8Var instanceof kdh ? new sdh((mdh) vq8Var.f, (qdh) vq8Var.g, tq8Var, (SettingsManager) vq8Var.c, ttaVar, true, (orm) vq8Var.d, (skm) vq8Var.e, (qr8) vq8Var.h, (nv2) vq8Var.i, (tlg) vq8Var.j, (p6l) vq8Var.l) : new ns8(tq8Var, (SettingsManager) vq8Var.c, vq8Var.a, o28Var, ttaVar, true, true, (skm) vq8Var.e, (qr8) vq8Var.h, (nv2) vq8Var.i, null, (zzj) vq8Var.k, (p6l) vq8Var.l);
        this.y = sdhVar;
        sdhVar.f = this.h;
        sdhVar.k.b(this);
        ns8 ns8Var = this.y;
        OverlayView overlayView = this.q;
        vi7 vi7Var = ns8Var.i;
        if (vi7Var != null) {
            vi7Var.o = overlayView;
        }
        ns8Var.registerAdapterDataObserver(this.f);
        this.v.getContext();
        pde pdeVar = this.A.d;
        Objects.requireNonNull(pdeVar);
        byte b2 = 2;
        FavoriteGridLayoutManager favoriteGridLayoutManager = new FavoriteGridLayoutManager(new gw7(pdeVar, (byte) 2), new kw3((byte) 9), true);
        this.x = favoriteGridLayoutManager;
        this.v.C0(favoriteGridLayoutManager);
        this.v.y0(this.y);
        q9n.d(new bm8(this, b), this.v);
        this.v.o(new yc3(this, b2));
        tq8 tq8Var2 = this.r;
        tq8Var2.getClass();
        if (tq8Var2 instanceof kdh) {
            this.o.findViewById(2131363008).setVisibility(8);
            this.o.findViewById(2131364777).setVisibility(8);
        } else {
            boolean z2 = arguments.getBoolean("focus");
            RecyclerView recyclerView = this.v;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.v.getPaddingTop(), this.v.getPaddingRight(), 0);
            EditText editText = (EditText) this.o.findViewById(2131363008);
            editText.setText(this.r.h());
            AtomicInteger atomicInteger = new AtomicInteger(editText.getCurrentHintTextColor());
            editText.setOnFocusChangeListener(new up2(editText, atomicInteger, b2));
            e73 e73Var = new e73(atomicInteger, editText, (byte) 5);
            dll dllVarV = hjf.v(editText.getContext());
            if (dllVarV != null) {
                u8n.b(dllVarV, editText, e73Var);
            }
            if (z) {
                editText.setOnEditorActionListener(this);
                if (z2) {
                    this.o.post(new kv(editText, (byte) 1));
                }
            } else {
                editText.setEnabled(false);
                editText.setInputType(0);
            }
        }
        this.k.a.b(this.l);
        this.B = true;
        this.o.b(new bn7((Object) this, (byte) 20));
        this.A.d.j(getViewLifecycleOwner(), new ks6(this, (byte) 7));
        return viewInflate;
    }

    @Override // defpackage.sj7
    public final void o(i iVar) {
        if (this.m) {
            return;
        }
        this.m = true;
        vi7 vi7Var = this.y.i;
        if (vi7Var != null) {
            vi7Var.q = true;
        }
        if (this.n) {
            return;
        }
        this.B = true;
        this.o.b(new bn7((Object) this, (byte) 20));
    }

    public final void o0() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (isRemoving()) {
            return;
        }
        FavoriteFolderRootView favoriteFolderRootView = this.o;
        if (favoriteFolderRootView != null) {
            EditText editText = (EditText) favoriteFolderRootView.findViewById(2131363008);
            tq8 tq8Var = this.r;
            if (tq8Var != null && !(tq8Var instanceof kdh)) {
                tq8Var.q(editText.getText().toString());
            }
            l5b l5bVar = q9n.c;
            q9n.u(getView());
        }
        flb flbVar = this.y.j;
        if (flbVar != null) {
            flbVar.i();
        }
        getParentFragmentManager().U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttach(Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        this.A = ((BrowserActivity) activity).K0();
        this.u = new zq8(this);
        this.s.F(this.t);
        ac8.c(this.u);
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return (i == 0 && !z && i2 == 0) ? this.o.a() : super/*androidx.fragment.app.Fragment*/.onCreateAnimator(i, z, i2);
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        RecyclerView recyclerView = this.v;
        if (recyclerView != null) {
            recyclerView.y0((d) null);
            this.v = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.k24
    public final void onDestroyView() {
        this.k.a.c(this.l);
        this.y.unregisterAdapterDataObserver(this.f);
        super.onDestroyView();
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        this.s.H(this.t);
        ac8.d(this.u);
        this.u = null;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.r.q(textView.getText().toString());
        textView.clearFocus();
        l5b l5bVar = q9n.c;
        q9n.u(getView());
        return true;
    }

    public final void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (this.m) {
            this.i.i();
        }
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        boolean z = this.m;
        if (!z || this.n || this.B || !z) {
            return;
        }
        this.i.d(this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0() {
        /*
            r5 = this;
            com.opera.android.favorites.FavoriteGridLayoutManager r0 = r5.x
            int r0 = r0.findFirstCompletelyVisibleItemPosition()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1b
            com.opera.android.favorites.FavoriteGridLayoutManager r0 = r5.x
            int r0 = r0.findLastCompletelyVisibleItemPosition()
            ns8 r3 = r5.y
            int r3 = r3.getItemCount()
            int r3 = r3 - r1
            if (r0 != r3) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            androidx.recyclerview.widget.RecyclerView r3 = r5.v
            if (r0 == 0) goto L22
            r4 = 2
            goto L23
        L22:
            r4 = r2
        L23:
            r3.setOverScrollMode(r4)
            if (r0 != 0) goto L33
            tq8 r0 = r5.r
            if (r0 == 0) goto L33
            r0.getClass()
            boolean r0 = r0 instanceof defpackage.kdh
            if (r0 == 0) goto L34
        L33:
            r1 = r2
        L34:
            android.view.View r5 = r5.w
            if (r1 != 0) goto L3a
            r2 = 8
        L3a:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar8.p0():void");
    }
}
