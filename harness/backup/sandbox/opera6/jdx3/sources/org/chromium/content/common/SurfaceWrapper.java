package org.chromium.content.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import android.view.SurfaceControl;
import android.window.InputTransferToken;
import defpackage.l7k;
import defpackage.pza;

/* loaded from: classes.dex */
public class SurfaceWrapper implements Parcelable {
    public static final Parcelable.Creator<SurfaceWrapper> CREATOR = new l7k((byte) 7);
    public final boolean a;
    public Surface b;
    public final boolean c;
    public SurfaceControl d;
    public final InputTransferToken e;

    public SurfaceWrapper(Surface surface, boolean z) {
        this.a = true;
        this.b = surface;
        this.c = z;
        this.d = null;
        this.e = null;
    }

    public SurfaceWrapper(Surface surface, boolean z, InputTransferToken inputTransferToken) {
        this(surface, z);
        this.e = inputTransferToken;
    }

    public SurfaceWrapper(SurfaceControl surfaceControl) {
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = surfaceControl;
        this.e = null;
    }

    public static InputTransferToken a(Parcel parcel) {
        return pza.g(InputTransferToken.CREATOR.createFromParcel(parcel));
    }

    public static SurfaceWrapper create(Surface surface, boolean z) {
        return new SurfaceWrapper(surface, z);
    }

    public static SurfaceWrapper create(Surface surface, boolean z, InputTransferToken inputTransferToken) {
        return new SurfaceWrapper(surface, z, inputTransferToken);
    }

    public static SurfaceWrapper createFromSurfaceControl(SurfaceControl surfaceControl) {
        return new SurfaceWrapper(surfaceControl);
    }

    public final boolean canBeUsedWithSurfaceControl() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final InputTransferToken getBrowserInputToken() {
        return this.e;
    }

    public final boolean getWrapsSurface() {
        return this.a;
    }

    public final Surface takeSurface() {
        Surface surface = this.b;
        this.b = null;
        return surface;
    }

    public final SurfaceControl takeSurfaceControl() {
        SurfaceControl surfaceControl = this.d;
        this.d = null;
        return surfaceControl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        parcel.writeInt(z ? 1 : 0);
        if (!z) {
            this.d.writeToParcel(parcel, 0);
            return;
        }
        int i2 = this.e != null ? 1 : 0;
        parcel.writeInt(i2);
        this.b.writeToParcel(parcel, 0);
        parcel.writeInt(this.c ? 1 : 0);
        if (i2 != 0) {
            this.e.writeToParcel(parcel, 0);
        }
    }
}
