package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class y66 implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(l45 l45Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        asa asaVar;
        if (this.mApplicationContext == null) {
            qp2.n("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = zra.a;
        if (iBinder == null) {
            asaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(asa.bp);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof asa)) {
                yra yraVar = new yra();
                yraVar.a = iBinder;
                asaVar = yraVar;
            } else {
                asaVar = (asa) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(new l45(false, asaVar, componentName, this.mApplicationContext));
    }

    public final void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
