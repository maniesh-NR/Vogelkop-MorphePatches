package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.hype.image.editor.TextBoxEditText;

/* loaded from: classes.dex */
public abstract class ba3 extends fya {
    public final aa3 e;
    public final aa3 f;
    public final aa3 g;
    public final aa3 h;
    public static final /* synthetic */ xtb[] j = {new pee(ba3.class, Constants.Params.VALUE, "getValue()Ljava/lang/String;", 0), new pee(ba3.class, Constants.Keys.LOCATION, "getLocation()Landroid/graphics/PointF;", 0), new pee(ba3.class, "scale", "getScale()F", 0), new pee(ba3.class, "rotation", "getRotation()F", 0)};
    public static final y55 i = new y55();

    public ba3(String str, PointF pointF, float f, float f2, eya eyaVar) {
        super(eyaVar);
        this.e = new aa3(str, this, (byte) 0);
        this.f = new aa3(pointF, this, (byte) 1);
        this.g = new aa3(Float.valueOf(f), this, (byte) 2);
        this.h = new aa3(Float.valueOf(f2), this, (byte) 3);
    }

    @Override // defpackage.fya
    public void a(cya cyaVar) {
        int i2 = cyaVar.b;
        Object obj = cyaVar.d;
        xtb[] xtbVarArr = j;
        if (i2 == 2131363166) {
            xtb xtbVar = xtbVarArr[0];
            this.e.g(xtbVar, (String) obj);
            return;
        }
        if (i2 == 2131363161) {
            xtb xtbVar2 = xtbVarArr[1];
            this.f.g(xtbVar2, (PointF) obj);
        } else {
            if (i2 == 2131363163) {
                Float f = (Float) obj;
                f.floatValue();
                this.g.g(xtbVarArr[2], f);
                return;
            }
            if (i2 == 2131363162) {
                Float f2 = (Float) obj;
                f2.floatValue();
                this.h.g(xtbVarArr[3], f2);
            }
        }
    }

    public final float e() {
        xtb xtbVar = j[2];
        return ((Number) this.g.b).floatValue();
    }

    public final String f() {
        xtb xtbVar = j[0];
        return (String) this.e.b;
    }

    public float g() {
        return 4.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(TextBoxEditText textBoxEditText) {
        if (!TextUtils.equals(textBoxEditText.getText(), f())) {
            textBoxEditText.setText(f());
        }
        textBoxEditText.setTextColor(-16777216);
        textBoxEditText.setBackgroundColor(0);
    }

    @Override // defpackage.fya, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(f());
        xtb[] xtbVarArr = j;
        xtb xtbVar = xtbVarArr[1];
        parcel.writeParcelable((PointF) this.f.b, i2);
        parcel.writeFloat(e());
        xtb xtbVar2 = xtbVarArr[3];
        parcel.writeFloat(((Number) this.h.b).floatValue());
    }
}
