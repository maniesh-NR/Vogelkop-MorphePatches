package defpackage;

import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.core.BuildConfig;
import com.leanplum.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class tvk implements ssl, uom, mf1, ann, crn, SuccessContinuation, loo, zzwo, jrp, ph, jtp, evp {
    public final Object a;

    public tvk() {
        this.a = new HashMap(100);
    }

    public /* synthetic */ tvk(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ tvk(kpo kpoVar, c9p c9pVar) {
        this.a = kpoVar;
    }

    public tvk(l7n l7nVar) {
        this.a = new kze(ng.a);
        m7n m7nVar = new m7n(this, (byte) 0);
        o7n o7nVar = l7nVar.a;
        if (o7nVar.d) {
            o7n.a(m7nVar);
            return;
        }
        synchronized (o7nVar.a) {
            o7nVar.c.add(m7nVar);
        }
    }

    public static void i(to9 to9Var) {
        to9Var.n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        to9Var.n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        to9Var.n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        to9Var.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        to9Var.n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        to9Var.n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        to9Var.n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        to9Var.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        to9Var.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        to9Var.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static ei2 o(to9 to9Var) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new tal("work_spec_id", "TEXT", 1, 1, true, (String) null));
        HashSet hashSetO = z1m.o(map, "prerequisite_id", new tal("prerequisite_id", "TEXT", 2, 1, true, (String) null), 2);
        hashSetO.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSetO.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet = new HashSet(2);
        boolean z = false;
        hashSet.add(new val("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        hashSet.add(new val("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
        wal walVar = new wal("Dependency", map, hashSetO, hashSet);
        wal walVarA = wal.a(to9Var, "Dependency");
        if (!walVar.equals(walVarA)) {
            return new ei2(z, z1m.k("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", walVar, "\n Found:\n", walVarA));
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new tal("id", "TEXT", 1, 1, true, (String) null));
        map2.put(Constants.Params.STATE, new tal(Constants.Params.STATE, "INTEGER", 0, 1, true, (String) null));
        map2.put("worker_class_name", new tal("worker_class_name", "TEXT", 0, 1, true, (String) null));
        map2.put("input_merger_class_name", new tal("input_merger_class_name", "TEXT", 0, 1, true, (String) null));
        map2.put("input", new tal("input", "BLOB", 0, 1, true, (String) null));
        map2.put("output", new tal("output", "BLOB", 0, 1, true, (String) null));
        map2.put("initial_delay", new tal("initial_delay", "INTEGER", 0, 1, true, (String) null));
        map2.put("interval_duration", new tal("interval_duration", "INTEGER", 0, 1, true, (String) null));
        map2.put("flex_duration", new tal("flex_duration", "INTEGER", 0, 1, true, (String) null));
        map2.put("run_attempt_count", new tal("run_attempt_count", "INTEGER", 0, 1, true, (String) null));
        map2.put("backoff_policy", new tal("backoff_policy", "INTEGER", 0, 1, true, (String) null));
        map2.put("backoff_delay_duration", new tal("backoff_delay_duration", "INTEGER", 0, 1, true, (String) null));
        map2.put("last_enqueue_time", new tal("last_enqueue_time", "INTEGER", 0, 1, true, "-1"));
        map2.put("minimum_retention_duration", new tal("minimum_retention_duration", "INTEGER", 0, 1, true, (String) null));
        map2.put("schedule_requested_at", new tal("schedule_requested_at", "INTEGER", 0, 1, true, (String) null));
        map2.put("run_in_foreground", new tal("run_in_foreground", "INTEGER", 0, 1, true, (String) null));
        map2.put("out_of_quota_policy", new tal("out_of_quota_policy", "INTEGER", 0, 1, true, (String) null));
        map2.put("period_count", new tal("period_count", "INTEGER", 0, 1, true, BuildConfig.BUILD_NUMBER));
        map2.put("generation", new tal("generation", "INTEGER", 0, 1, true, BuildConfig.BUILD_NUMBER));
        map2.put("next_schedule_time_override", new tal("next_schedule_time_override", "INTEGER", 0, 1, true, "9223372036854775807"));
        map2.put("next_schedule_time_override_generation", new tal("next_schedule_time_override_generation", "INTEGER", 0, 1, true, BuildConfig.BUILD_NUMBER));
        map2.put("stop_reason", new tal("stop_reason", "INTEGER", 0, 1, true, "-256"));
        map2.put("trace_tag", new tal("trace_tag", "TEXT", 0, 1, false, (String) null));
        map2.put("required_network_type", new tal("required_network_type", "INTEGER", 0, 1, true, (String) null));
        map2.put("required_network_request", new tal("required_network_request", "BLOB", 0, 1, true, "x''"));
        map2.put("requires_charging", new tal("requires_charging", "INTEGER", 0, 1, true, (String) null));
        map2.put("requires_device_idle", new tal("requires_device_idle", "INTEGER", 0, 1, true, (String) null));
        map2.put("requires_battery_not_low", new tal("requires_battery_not_low", "INTEGER", 0, 1, true, (String) null));
        map2.put("requires_storage_not_low", new tal("requires_storage_not_low", "INTEGER", 0, 1, true, (String) null));
        map2.put("trigger_content_update_delay", new tal("trigger_content_update_delay", "INTEGER", 0, 1, true, (String) null));
        map2.put("trigger_max_content_delay", new tal("trigger_max_content_delay", "INTEGER", 0, 1, true, (String) null));
        HashSet hashSetO2 = z1m.o(map2, "content_uri_triggers", new tal("content_uri_triggers", "BLOB", 0, 1, true, (String) null), 0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new val("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
        hashSet2.add(new val("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
        wal walVar2 = new wal("WorkSpec", map2, hashSetO2, hashSet2);
        wal walVarA2 = wal.a(to9Var, "WorkSpec");
        if (!walVar2.equals(walVarA2)) {
            return new ei2(z, z1m.k("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", walVar2, "\n Found:\n", walVarA2));
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new tal("tag", "TEXT", 1, 1, true, (String) null));
        boolean z2 = true;
        HashSet hashSetO3 = z1m.o(map3, "work_spec_id", new tal("work_spec_id", "TEXT", 2, 1, true, (String) null), 1);
        hashSetO3.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new val("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        wal walVar3 = new wal("WorkTag", map3, hashSetO3, hashSet3);
        wal walVarA3 = wal.a(to9Var, "WorkTag");
        if (!walVar3.equals(walVarA3)) {
            return new ei2(z, z1m.k("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", walVar3, "\n Found:\n", walVarA3));
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new tal("work_spec_id", "TEXT", 1, 1, true, (String) null));
        map4.put("generation", new tal("generation", "INTEGER", 2, 1, true, BuildConfig.BUILD_NUMBER));
        HashSet hashSetO4 = z1m.o(map4, "system_id", new tal("system_id", "INTEGER", 0, 1, true, (String) null), 1);
        hashSetO4.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        wal walVar4 = new wal("SystemIdInfo", map4, hashSetO4, new HashSet(0));
        wal walVarA4 = wal.a(to9Var, "SystemIdInfo");
        if (!walVar4.equals(walVarA4)) {
            return new ei2(z, z1m.k("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", walVar4, "\n Found:\n", walVarA4));
        }
        HashMap map5 = new HashMap(2);
        map5.put(Constants.Params.NAME, new tal(Constants.Params.NAME, "TEXT", 1, 1, true, (String) null));
        HashSet hashSetO5 = z1m.o(map5, "work_spec_id", new tal("work_spec_id", "TEXT", 2, 1, true, (String) null), 1);
        hashSetO5.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new val("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
        wal walVar5 = new wal("WorkName", map5, hashSetO5, hashSet4);
        wal walVarA5 = wal.a(to9Var, "WorkName");
        if (!walVar5.equals(walVarA5)) {
            return new ei2(z, z1m.k("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", walVar5, "\n Found:\n", walVarA5));
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new tal("work_spec_id", "TEXT", 1, 1, true, (String) null));
        HashSet hashSetO6 = z1m.o(map6, "progress", new tal("progress", "BLOB", 0, 1, true, (String) null), 1);
        hashSetO6.add(new ual("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        wal walVar6 = new wal("WorkProgress", map6, hashSetO6, new HashSet(0));
        wal walVarA6 = wal.a(to9Var, "WorkProgress");
        if (!walVar6.equals(walVarA6)) {
            return new ei2(z, z1m.k("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", walVar6, "\n Found:\n", walVarA6));
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new tal("key", "TEXT", 1, 1, true, (String) null));
        wal walVar7 = new wal("Preference", map7, z1m.o(map7, "long_value", new tal("long_value", "INTEGER", 0, 1, false, (String) null), 0), new HashSet(0));
        wal walVarA7 = wal.a(to9Var, "Preference");
        return !walVar7.equals(walVarA7) ? new ei2(z, z1m.k("Preference(androidx.work.impl.model.Preference).\n Expected:\n", walVar7, "\n Found:\n", walVarA7)) : new ei2(z2, null);
    }

    public static IllegalArgumentException r(String str) {
        return new IllegalArgumentException(sko.j("Unsupported type: ", str));
    }

    @Override // defpackage.loo
    public final void a() {
        wm wmVar = (wm) ((lxo) this.a).a;
        if (wmVar != null) {
            wmVar.g();
        }
    }

    @Override // defpackage.crn
    public final ViewGroup b() {
        return ((lqn) this.a).k;
    }

    @Override // defpackage.jtp
    public final void c(otp otpVar, File file, boolean z) {
        wjj wjjVar = (wjj) this.a;
        ((HashSet) wjjVar.b).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) wjjVar.c).set(false);
    }

    @Override // defpackage.ann
    public final void d() {
        m59 m59Var = (m59) this.a;
        m59Var.h(((qln) m59Var.g).b());
    }

    @Override // defpackage.ann
    public final void e() {
        m59 m59Var = (m59) this.a;
        m59Var.h(((qln) m59Var.g).b());
    }

    public final boolean f(bzo bzoVar, int i) {
        Integer numValueOf;
        wgo wgoVar = new wgo(bzoVar);
        HashMap map = (HashMap) this.a;
        Integer num = (Integer) map.get(wgoVar);
        if (num == null) {
            if (map.size() >= 100) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (((wgo) it.next()).a.get() == null) {
                        it.remove();
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        } else {
            if ((num.intValue() & i) != 0) {
                return false;
            }
            numValueOf = Integer.valueOf(num.intValue() | i);
        }
        map.put(wgoVar, numValueOf);
        return true;
    }

    @Override // defpackage.crn
    public final boolean g() {
        lqn lqnVar = (lqn) this.a;
        if (lqnVar.K != null || lqnVar.getView() == null) {
            return false;
        }
        zv0 zv0Var = lqnVar.E;
        if (zv0Var == null) {
            zv0Var = null;
        }
        return !zv0Var.d;
    }

    public final n89 get(int i) {
        return (n89) this.a;
    }

    public final FileChannel h() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        qp2.o("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
        return null;
    }

    @Override // defpackage.crn
    public final rn9 j() {
        return new rn9((Object) ((lqn) this.a).u, (Object) mf0.i, (byte) 18);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r4 = (ProxyBillingActivityV2) this.a;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r4.g;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = ohVar.a;
        if (i2 != -1 || i != 0) {
            zzc.zzo("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        r4.finish();
    }

    public final huh l() {
        return ((WebContentsImpl) ((wci) this.a).b).g;
    }

    @Override // defpackage.crn
    public final void m(sba sbaVar, lrn lrnVar) {
        ((lqn) this.a).L0(sbaVar, lrnVar);
    }

    public final void n(boolean z, boolean z2) {
        g4l g4lVar = (g4l) this.a;
        g4lVar.l = null;
        byte b = 0;
        g4lVar.k = false;
        xf8.F0(g4lVar.i, z ? a4l.a : a4l.c);
        orm ormVar = (orm) ((nw3) g4lVar.c.c.a).get();
        vb0 vb0Var = z ? vb0.b : z2 ? vb0.c : vb0.d;
        x5f x5fVar = (x5f) ormVar;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new d5f(vb0Var, b));
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.loo
    public final void onAdClicked() {
        wm wmVar = (wm) ((lxo) this.a).a;
        if (wmVar != null) {
            wmVar.onAdClicked();
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((usl) this.a).b.a.onMenuItemSelected(0, menuItem);
    }

    public final Object p(String str) throws NumberFormatException {
        w9m w9mVar = (w9m) this.a;
        if (c.q(str, "(", false)) {
            throw r(str);
        }
        int iP = StringsKt.P(str, '[', 0, 6);
        if (iP >= 0) {
            int iK = StringsKt.K(str, ']', iP, 4);
            if (iK <= iP) {
                qp2.o("Failed requirement.");
                return null;
            }
            Object objP = p(str.substring(0, iP));
            String strSubstring = str.substring(iP + 1, iK);
            return w9mVar.q(strSubstring.length() != 0 ? Integer.valueOf(Integer.parseInt(strSubstring)) : null, objP);
        }
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                char cCharAt = str.charAt(i);
                if ('0' <= cCharAt && cCharAt < ':') {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            Object objCreate = w9mVar.create(str);
            if (objCreate != null) {
                return objCreate;
            }
            throw r(str);
        }
        try {
            int i2 = Integer.parseInt(str.substring(i));
            if (1 > i2 || i2 >= 257) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Object objE = w9mVar.e(i2, i >= 0 ? str.substring(0, i) : str);
            if (objE != null) {
                return objE;
            }
            throw r(str);
        } catch (IllegalArgumentException unused) {
            Object objCreate2 = w9mVar.create(str);
            if (objCreate2 != null) {
                return objCreate2;
            }
            throw r(str);
        }
    }

    public void q() {
        ((WebSettingsBoundaryInterface) this.a).setForceDarkBehavior(1);
    }

    public final Task then(Object obj) {
        kpo kpoVar = (kpo) this.a;
        return Tasks.forResult(new cqo(kpoVar.b, ((Long) obj).longValue()));
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        ((m59) this.a).h(bnnVar.a);
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        ((m59) this.a).h(cnnVar.a);
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final zzwe mo1zza() {
        zzrd zzrdVar = new zzrd();
        zzra zzraVar = zpp.c() ? zzra.zzc : zzra.zzb;
        zzrb zzrbVar = (zzrb) this.a;
        zzrdVar.zze(zzraVar);
        zzrs zzrsVar = new zzrs();
        zzrsVar.zzb(zzrbVar);
        zzrdVar.zzh(zzrsVar.zzc());
        return zzws.zzf(zzrdVar);
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        return cvp.b(((h61) this.a).a);
    }

    public final void zza() throws XmlPullParserException {
        XmlPullParser xmlPullParser;
        top topVar = (top) this.a;
        int i = 0;
        String attributeValue = null;
        String attributeValue2 = null;
        while (true) {
            xmlPullParser = topVar.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue = xmlPullParser.getAttributeValue(i);
            }
            if ("errorCode".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue2 = xmlPullParser.getAttributeValue(i);
            }
            i++;
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
        }
        wci wciVar = topVar.b;
        Integer num = (Integer) jop.c.get(attributeValue2);
        if (num == null) {
            qp2.o(attributeValue2.concat(" is unknown error."));
            return;
        }
        Map map = (Map) wciVar.c;
        if (map == null) {
            qp2.n("Property \"splitInstallErrorCodeByModule\" has not been set");
        } else {
            map.put(attributeValue, num);
            while (xmlPullParser.next() != 3) {
            }
        }
    }
}
