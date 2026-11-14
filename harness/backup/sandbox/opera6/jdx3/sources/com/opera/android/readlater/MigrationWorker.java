package com.opera.android.readlater;

import android.R;
import android.app.Notification;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bx1;
import defpackage.cm;
import defpackage.kqd;
import defpackage.l1f;
import defpackage.ua7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/opera/android/readlater/MigrationWorker;", "Lajc;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lesk;", "Lglh;", "content", "Lsyd;", "migrationController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lesk;Lesk;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MigrationWorker extends ajc {
    public final esk e;
    public final esk f;
    public final bx1 g;
    public ac1 h;

    public MigrationWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull esk eskVar, @NotNull esk eskVar2) {
        super(context, workerParameters);
        this.e = eskVar;
        this.f = eskVar2;
        this.g = new bx1((byte) 3);
    }

    public final ListenableFuture a() {
        ac1 ac1Var = this.h;
        int i = 2131363596;
        if (ac1Var == null) {
            ac1Var = new ac1();
            ac1Var.c = ((ajc) this).a.getApplicationContext();
            ua7 ua7VarT = zi4.t("offline_pages_migration", new cm((String) null, i, (byte) 5));
            ac1Var.d = ua7VarT;
            ua7VarT.S(R.drawable.stat_notify_sync);
            l1f l1fVar = (l1f) ua7VarT.b;
            l1fVar.h(8, true);
            ua7VarT.R(true);
            l1fVar.d(false);
            this.h = ac1Var;
        }
        return yr9.c(new ij9(2131363596, (Notification) ac1Var.c().b, 0));
    }

    public final o94 b() {
        return k1g.z(new kqd((Object) this, (byte) 2));
    }
}
