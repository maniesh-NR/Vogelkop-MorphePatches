package defpackage;

/* loaded from: classes.dex */
public abstract class v5i {
    public void a(to9 to9Var) {
        to9Var.h();
        try {
            to9Var.n("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            to9Var.s();
        } finally {
            to9Var.m();
        }
    }
}
