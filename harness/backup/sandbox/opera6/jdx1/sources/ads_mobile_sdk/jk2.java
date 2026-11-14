package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.a0p;
import defpackage.dlp;
import defpackage.enp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jk2 extends oz2 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ byte e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(lk2 lk2Var, TaskCompletionSource taskCompletionSource, ah2 ah2Var, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.d = lk2Var;
        this.b = ah2Var;
        this.c = taskCompletionSource2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk2(u13 u13Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, jk2 jk2Var) {
        super(taskCompletionSource);
        this.d = u13Var;
        this.c = taskCompletionSource2;
        this.b = jk2Var;
    }

    @Override // ads_mobile_sdk.oz2
    public final void a() {
        switch (this.e) {
            case 0:
                lk2 lk2Var = (lk2) this.d;
                String str = lk2Var.b;
                try {
                    enp enpVar = lk2Var.a.n;
                    ah2 ah2Var = (ah2) this.b;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList(ah2Var.a);
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        Bundle bundle = new Bundle();
                        bundle.putString("url", (String) obj);
                        arrayList.add(bundle);
                    }
                    Bundle bundle2 = new Bundle();
                    rno kk2Var = new kk2(lk2Var);
                    dlp dlpVar = (dlp) enpVar;
                    dlpVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(dlpVar.c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedList(arrayList);
                    int i2 = a0p.a;
                    parcelObtain.writeInt(1);
                    bundle2.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(kk2Var);
                    try {
                        dlpVar.b.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    e7 e7Var = lk2.c;
                    Object[] objArr = {str};
                    e7Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        e7.a((String) e7Var.a, "prewarm(%s)", objArr);
                    }
                    this.c.trySetException(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((u13) this.d).f) {
                    TaskCompletionSource taskCompletionSource = this.c;
                    u13 u13Var = (u13) this.d;
                    u13Var.e.add(taskCompletionSource);
                    taskCompletionSource.getTask().addOnCompleteListener(new roj(u13Var, taskCompletionSource, (byte) 27));
                    if (((u13) this.d).l.getAndIncrement() > 0) {
                        ((u13) this.d).b.a("Already connected to the service.", new Object[0]);
                    }
                    ((u13) this.d).a((jk2) this.b);
                }
                return;
        }
    }
}
