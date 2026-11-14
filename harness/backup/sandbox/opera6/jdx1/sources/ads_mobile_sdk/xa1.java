package ads_mobile_sdk;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import defpackage.a0p;
import defpackage.hkp;
import defpackage.rih;
import defpackage.wip;
import defpackage.z04;

/* loaded from: classes.dex */
public final class xa1 extends rih {
    public byte a = 0;
    public final Context b;
    public final String c;
    public hkp d;
    public wa1 e;

    public xa1(Context context) {
        this.b = context.getApplicationContext();
        String packageName = (z04.c() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? ((SdkSandboxController) context.getSystemService(SdkSandboxController.class)).getClientPackageName() : context.getPackageName();
        this.c = packageName;
    }

    public final w8 a() throws RemoteException {
        if (this.a != 2 || this.d == null || this.e == null) {
            qp2.n("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.c);
        try {
            wip wipVar = (wip) this.d;
            wipVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(wipVar.c);
            int i = a0p.a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            Parcel parcelA = wipVar.a(1, parcelObtain);
            Parcelable parcelable = parcelA.readInt() != 0 ? (Parcelable) Bundle.CREATOR.createFromParcel(parcelA) : null;
            parcelA.recycle();
            return new w8((Bundle) parcelable);
        } catch (RemoteException e) {
            this.a = (byte) 0;
            throw e;
        }
    }
}
