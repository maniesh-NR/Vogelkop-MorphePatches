package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ozg extends j83 {
    public final umi a;
    public final p0h b;
    public final wzg c;
    public final x5f d;
    public final boolean e;
    public or2 f;

    public ozg(umi umiVar, p0h p0hVar, wzg wzgVar, x5f x5fVar, boolean z) {
        this.a = umiVar;
        this.b = p0hVar;
        this.c = wzgVar;
        this.d = x5fVar;
        this.e = z;
    }

    @Override // defpackage.j83
    public final View f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559242, viewGroup, false);
        int i = 2131362698;
        FrameLayout frameLayout = (FrameLayout) w1h.j(2131362698, viewInflate);
        if (frameLayout != null) {
            i = 2131363179;
            FrameLayout frameLayout2 = (FrameLayout) w1h.j(2131363179, viewInflate);
            if (frameLayout2 != null) {
                i = 2131363992;
                FrameLayout frameLayout3 = (FrameLayout) w1h.j(2131363992, viewInflate);
                if (frameLayout3 != null) {
                    i = 2131365090;
                    TextView textView = (TextView) w1h.j(2131365090, viewInflate);
                    if (textView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.f = new or2(linearLayout, frameLayout, frameLayout2, frameLayout3, textView, (byte) 23);
                        return linearLayout;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void h0(byte[][] bArr, TextView textView) {
        if (bArr != null) {
            textView.setVisibility(0);
            phj.b0(textView, phj.D0(textView.getText().toString()), new nzg(this, bArr, textView, (byte) 1));
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        wzg wzgVar = this.c;
        if (z) {
            ArrayDeque arrayDeque = (ArrayDeque) wzgVar.b;
            arrayDeque.addLast(Boolean.TRUE);
            boolean zIsEmpty = arrayDeque.isEmpty();
            kze kzeVar = (kze) wzgVar.c;
            if (zIsEmpty) {
                kzeVar.r(Boolean.FALSE);
            } else {
                kzeVar.r((Boolean) arrayDeque.getLast());
            }
        } else {
            ArrayDeque arrayDeque2 = (ArrayDeque) wzgVar.b;
            arrayDeque2.pop();
            boolean zIsEmpty2 = arrayDeque2.isEmpty();
            kze kzeVar2 = (kze) wzgVar.c;
            if (zIsEmpty2) {
                kzeVar2.r(Boolean.FALSE);
            } else {
                kzeVar2.r((Boolean) arrayDeque2.getLast());
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b.f.j(getViewLifecycleOwner(), new d8d(this, (byte) 29));
    }
}
