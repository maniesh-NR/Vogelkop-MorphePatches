package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class wz9 extends kuk implements Function1 {
    public boolean t;
    public final /* synthetic */ k5o u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz9(k5o k5oVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.u = k5oVar;
    }

    public final mt5 create(mt5 mt5Var) {
        return new wz9(this.u, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws kbb {
        k5o k5oVar = this.u;
        Context context = (Context) k5oVar.b;
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            if (!fr3.Q(context, "android.permission.ACCESS_COARSE_LOCATION") && !fr3.Q(context, "android.permission.ACCESS_FINE_LOCATION")) {
                throw new kbb();
            }
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            Task currentLocation = ((FusedLocationProviderClient) ((zyk) k5oVar.c).getValue()).getCurrentLocation(new CurrentLocationRequest.Builder().setGranularity(0).setPriority(102).build(), cancellationTokenSource.getToken());
            this.t = true;
            obj = a4h.b(currentLocation, cancellationTokenSource, this);
            if (obj == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        Location location = (Location) obj;
        if (location == null) {
            return null;
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        ebb ebbVar = ebb.c;
        return new uv9(latitude, longitude, j06.m(location.getTime()));
    }
}
