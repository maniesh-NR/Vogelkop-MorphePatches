package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.TypedValue;
import com.leanplum.internal.Constants;
import com.opera.hype.image.editor.TextBoxEditText;

/* loaded from: classes.dex */
public final class oel extends ba3 {
    public final PointF k;
    public final transient boolean l;
    public final mel m;
    public final mel n;
    public final mel o;
    public final mel p;
    public final mel q;
    public final mel r;
    public static final /* synthetic */ xtb[] t = {new pee(oel.class, Constants.Kinds.COLOR, "getColor()I", 0), new pee(oel.class, "inverted", "getInverted()Z", 0), new pee(oel.class, "style", "getStyle()I", 0), new pee(oel.class, "font", "getFont()Lcom/opera/hype/image/editor/TextFont;", 0), new pee(oel.class, "isAllCaps", "isAllCaps()Z", 0), new pee(oel.class, "strokeColor", "getStrokeColor()I", 0)};
    public static final ioj s = new ioj((byte) 5);

    public oel(String str, PointF pointF, float f, float f2, int i, boolean z, PointF pointF2, int i2, boolean z2, nil nilVar, boolean z3, int i3) {
        super(str, pointF, f, f2, eya.d);
        this.k = pointF2;
        this.l = z2;
        this.m = new mel(Integer.valueOf(i), this, (byte) 0);
        this.n = new mel(Boolean.valueOf(z), this, (byte) 1);
        this.o = new mel(Integer.valueOf(i2), this, (byte) 2);
        this.p = new mel(nilVar, this, (byte) 3);
        this.q = new mel(Boolean.valueOf(z3), this, (byte) 4);
        this.r = new mel(Integer.valueOf(i3), this, (byte) 5);
    }

    @Override // defpackage.ba3, defpackage.fya
    public final void a(cya cyaVar) {
        int i = cyaVar.b;
        Object obj = cyaVar.d;
        xtb[] xtbVarArr = t;
        if (i == 2131363160) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.n.g(xtbVarArr[1], bool);
            return;
        }
        if (i == 2131363158) {
            Integer num = (Integer) obj;
            num.intValue();
            this.m.g(xtbVarArr[0], num);
            return;
        }
        if (i == 2131363165) {
            Integer num2 = (Integer) obj;
            num2.intValue();
            this.o.g(xtbVarArr[2], num2);
            return;
        }
        if (i == 2131363159) {
            xtb xtbVar = xtbVarArr[3];
            this.p.g(xtbVar, (nil) obj);
        } else {
            if (i == 2131363157) {
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.q.g(xtbVarArr[4], bool2);
                return;
            }
            if (i != 2131363164) {
                super.a(cyaVar);
                return;
            }
            Integer num3 = (Integer) obj;
            num3.intValue();
            this.r.g(xtbVarArr[5], num3);
        }
    }

    @Override // defpackage.ba3
    public final float g() {
        return 2.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba3
    public final void h(TextBoxEditText textBoxEditText) {
        if (!TextUtils.equals(textBoxEditText.getText(), f())) {
            textBoxEditText.setText(f());
        }
        int i = i();
        s.getClass();
        int i2 = ab5.f(i) >= 0.5d ? -16777216 : -1;
        if (!j()) {
            i2 = i();
        }
        int i3 = j() ? i() : 0;
        textBoxEditText.setTextColor(i2);
        textBoxEditText.setHighlightColor(ab5.l(i2, 61));
        Drawable drawable = textBoxEditText.getContext().getDrawable(2131231743);
        drawable.setAlpha(Color.alpha(i3));
        Drawable drawable2 = textBoxEditText.getContext().getDrawable(2131231737);
        drawable2.setTint(i3);
        textBoxEditText.setBackground(new LayerDrawable(new Drawable[]{drawable, drawable2}));
        int iF = (int) (ab5.f(i2) * (255 - r5));
        if (iF == 0) {
            textBoxEditText.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            textBoxEditText.setShadowLayer((int) TypedValue.applyDimension(1, 2.0f, textBoxEditText.getResources().getDisplayMetrics()), 0.0f, 0.0f, ab5.l(-16777216, iF));
        }
        xtb xtbVar = t[3];
        textBoxEditText.l.e(l(), ((nil) this.p.b).a);
        textBoxEditText.setAllCaps(u());
        textBoxEditText.j.g(TextBoxEditText.o[0], Integer.valueOf(k()));
    }

    public final int i() {
        xtb xtbVar = t[0];
        return ((Number) this.m.b).intValue();
    }

    public final boolean j() {
        xtb xtbVar = t[1];
        return ((Boolean) this.n.b).booleanValue();
    }

    public final int k() {
        xtb xtbVar = t[5];
        return ((Number) this.r.b).intValue();
    }

    public final int l() {
        xtb xtbVar = t[2];
        return ((Number) this.o.b).intValue();
    }

    public final boolean u() {
        xtb xtbVar = t[4];
        return ((Boolean) this.q.b).booleanValue();
    }

    @Override // defpackage.ba3, defpackage.fya, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(i());
        parcel.writeInt(j() ? 1 : 0);
        parcel.writeParcelable(this.k, i);
        parcel.writeInt(l());
        parcel.writeInt(this.l ? 1 : 0);
        xtb xtbVar = t[3];
        parcel.writeInt(((nil) this.p.b).ordinal());
        parcel.writeInt(u() ? 1 : 0);
        parcel.writeInt(k());
    }
}
