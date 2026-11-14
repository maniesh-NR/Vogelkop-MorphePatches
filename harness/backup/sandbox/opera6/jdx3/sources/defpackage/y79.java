package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class y79 extends ViewGroup.MarginLayoutParams implements u79 {
    public static final Parcelable.Creator<y79> CREATOR = new uz8((byte) 8);
    public int a;
    public float b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    public final float E() {
        return this.c;
    }

    public final int K() {
        return this.f;
    }

    public final int W() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    public final void X0(int i) {
        this.f = i;
    }

    public final int Y0() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final void Z(int i) {
        this.g = i;
    }

    public final float b0() {
        return this.b;
    }

    public final int b1() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    public final int describeContents() {
        return 0;
    }

    public final float e0() {
        return this.e;
    }

    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    public final int getOrder() {
        return this.a;
    }

    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    public final boolean m0() {
        return this.j;
    }

    public final int o1() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int p1() {
        return this.g;
    }

    public final int t() {
        return this.d;
    }

    public final int w0() {
        return this.h;
    }

    public final int w1() {
        return this.i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
