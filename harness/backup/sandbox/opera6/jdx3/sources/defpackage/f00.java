package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class f00 extends l00 {
    public final /* synthetic */ byte E = 0;

    public f00(View view, int i, int i2, kze kzeVar) {
        super(view, new vv8((byte) 0), kzeVar);
        View jsdVar = new jsd(view.getContext());
        Resources resources = ((i) this).itemView.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.width = fan.a(i, resources);
        layoutParams.height = (int) TypedValue.applyDimension(1, i2, resources.getDisplayMetrics());
        layoutParams.gravity = 17;
        jsdVar.setLayoutParams(layoutParams);
        h0(jsdVar);
    }

    public f00(View view, kze kzeVar) {
        super(view, new m00((byte) 0), kzeVar);
    }

    @Override // defpackage.l00, defpackage.ab2
    public final /* bridge */ /* synthetic */ mq Z() {
        switch (this.E) {
        }
        return Z();
    }

    @Override // defpackage.l00, defpackage.o43
    public final /* bridge */ /* synthetic */ mq e0() {
        switch (this.E) {
        }
        return e0();
    }

    @Override // defpackage.l00, defpackage.bu8
    public final /* bridge */ /* synthetic */ yz f0() {
        switch (this.E) {
        }
        return f0();
    }
}
