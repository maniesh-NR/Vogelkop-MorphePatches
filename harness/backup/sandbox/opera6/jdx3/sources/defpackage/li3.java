package defpackage;

/* loaded from: classes.dex */
public final class li3 extends z4o {
    public final /* synthetic */ byte r;

    public /* synthetic */ li3(byte b) {
        this.r = b;
    }

    public li3(mi3 mi3Var) {
        this.r = (byte) 0;
    }

    public final String L() {
        switch (this.r) {
            case 0:
                return "UPDATE `active_block_lists` SET `name` = ?,`kind` = ?,`checksum` = ?,`addedTimestampMillis` = ?,`ttlMillis` = ?,`version` = ?,`active` = ? WHERE `name` = ? AND `kind` = ?";
            case 1:
                return "DELETE FROM `Entry` WHERE `pageUrl` = ?";
            case 2:
                return "DELETE FROM `Entry` WHERE `tabId` = ?";
            case 3:
                return "DELETE FROM `followed_teams` WHERE `oscoreId` = ? AND `sport` = ?";
            case 4:
                return "DELETE FROM `followed_tournaments` WHERE `oscoreId` = ? AND `sport` = ?";
            default:
                return "DELETE FROM `followed_matches` WHERE `oscoreId` = ? AND `sport` = ?";
        }
    }

    public final void p(wsk wskVar, Object obj) {
        switch (this.r) {
            case 0:
                dj3 dj3Var = (dj3) obj;
                wskVar.h(1, dj3Var.a);
                sj3 sj3Var = dj3Var.b;
                wskVar.h(2, mi3.a(sj3Var));
                String str = dj3Var.c;
                if (str == null) {
                    qp2.n("Cannot bind NULLABLE value 'raw' of inline class 'SHA256HexLowercase' to a NOT NULL column.");
                    break;
                } else {
                    wskVar.h(3, str);
                    wskVar.T0(4, dj3Var.d);
                    wskVar.T0(5, dj3Var.e);
                    wskVar.T0(6, dj3Var.f);
                    wskVar.T0(7, dj3Var.g ? 1L : 0L);
                    wskVar.h(8, dj3Var.a);
                    wskVar.h(9, mi3.a(sj3Var));
                    break;
                }
            case 1:
                wskVar.h(1, ((x4l) obj).a);
                break;
            case 2:
                wskVar.T0(1, ((m7l) obj).a);
                break;
            case 3:
                gh9 gh9Var = (gh9) obj;
                wskVar.T0(1, gh9Var.a);
                wskVar.T0(2, gh9Var.b.a ? 1L : 0L);
                break;
            case 4:
                hh9 hh9Var = (hh9) obj;
                wskVar.T0(1, hh9Var.a);
                wskVar.T0(2, hh9Var.b.a ? 1L : 0L);
                break;
            default:
                fh9 fh9Var = (fh9) obj;
                wskVar.T0(1, fh9Var.a);
                wskVar.T0(2, fh9Var.b.a ? 1L : 0L);
                break;
        }
    }
}
