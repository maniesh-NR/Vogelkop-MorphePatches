package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class agd extends c09 {
    public final MeasurementManager W;

    public agd(MeasurementManager measurementManager) {
        this.W = measurementManager;
    }

    public static Object E(agd agdVar, Uri uri, InputEvent inputEvent, mt5<? super Unit> mt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        agdVar.W.registerSource(uri, inputEvent, new bx1((byte) 2), new pt5(nh4Var));
        Object objQ = nh4Var.q();
        return objQ == px5.a ? objQ : Unit.a;
    }

    public Object B(@NotNull Uri uri, InputEvent inputEvent, @NotNull mt5<? super Unit> mt5Var) {
        return E(this, uri, inputEvent, mt5Var);
    }
}
