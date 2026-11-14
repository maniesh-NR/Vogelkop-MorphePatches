package defpackage;

import com.leanplum.utils.SizeUtil;
import java.util.List;

/* loaded from: classes.dex */
public final class nb2 extends kfo {
    public final /* synthetic */ byte k;

    public /* synthetic */ nb2(byte b) {
        this.k = b;
    }

    public /* synthetic */ nb2(Object obj, byte b) {
        this.k = b;
    }

    public final String C() {
        switch (this.k) {
            case 0:
                return "INSERT OR REPLACE INTO `asset_links` (`domain`,`relation`,`namespace`,`packageName`,`sha256CertFingerprints`,`timestamp`) VALUES (?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `whitelisted_domains` (`domain`) VALUES (?)";
            case 2:
                return "INSERT INTO `active_block_lists` (`name`,`kind`,`checksum`,`addedTimestampMillis`,`ttlMillis`,`version`,`active`) VALUES (?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `Entry` (`pageUrl`,`imageUrl`,`timeStamp`,`flags`) VALUES (?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `Entry` (`tabId`,`descriptionMedium`,`descriptionMini`) VALUES (?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `add_favorite_removed_suggestion` (`url`) VALUES (?)";
            case 6:
                return "INSERT OR REPLACE INTO `entry` (`storageId`,`startQuery`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `football_events` (`oscoreId`,`source`,`homeTeamName`,`homeTeamLogoUrl`,`homeTeamScore`,`homeTeamScorePenalties`,`awayTeamName`,`awayTeamLogoUrl`,`awayTeamScore`,`awayTeamScorePenalties`,`eventStatus`,`statusDescription`,`finishType`,`startTimestamp`,`timeCurrent`,`timeFirstHalf`,`timeFirstHalfExtended`,`timeSecondHalf`,`timeSecondHalfExtended`,`timeFirstHalfExtra`,`timeFirstHalfExtraExtended`,`timeSecondHalfExtra`,`timeSecondHalfExtraExtended`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `notifications` (`oscoreId`,`sport`,`ttlEndTimestamp`,`subscribed`) VALUES (?,?,?,?)";
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return "INSERT OR REPLACE INTO `followed_matches` (`oscoreId`,`sport`) VALUES (?,?)";
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "INSERT OR REPLACE INTO `followed_teams` (`oscoreId`,`sport`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `followed_tournaments` (`oscoreId`,`sport`) VALUES (?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `event_odds` (`oddsId`,`oddsProvider`,`oddsType`,`eventOscoreId`,`name`,`value`,`delta`,`jumpUrl`,`order`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `odds_provider_config` (`id`,`name`,`normalIcon`,`lightIcon`,`smallIcon`,`logoClickUrl`) VALUES (?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `football_audio_commentary` (`oscoreId`,`url`) VALUES (?,?)";
            case 15:
                return "INSERT OR ABORT INTO `messages` (`id`,`received`,`created_by`,`encrypted_metadata`,`encrypted_content`,`content_url`,`iv_metadata`,`iv`,`local_content`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `recent_searches` (`settings_id`,`timestamp`) VALUES (?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `redirects` (`original_url`,`final_url`) VALUES (?,?)";
            case SizeUtil.textSize0_1 /* 18 */:
                return "INSERT OR REPLACE INTO `metadata` (`urlHash`,`type`,`impressions`,`clicks`,`previous_impression_time`,`blacklisted`) VALUES (?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `provider_info` (`type`,`score`) VALUES (?,?)";
            case SizeUtil.textSize0 /* 20 */:
                return "INSERT OR ABORT INTO `partner_data` (`id`,`url`,`final_domain`,`title`,`score`,`icon_url`,`received`,`keep_until`,`global_score`,`autocomplete_chars`,`recommend_chars`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR ABORT INTO `partner_tree` (`received`,`keep_until`,`tree`) VALUES (?,?,?)";
            case SizeUtil.textSize1 /* 22 */:
                return "INSERT OR ABORT INTO `domain_data` (`domain`,`rating`,`last_updated`) VALUES (?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `activity` (`url`,`lastAccess`) VALUES (?,?)";
            case SizeUtil.textSize2 /* 24 */:
                return "INSERT OR ABORT INTO `language_prefs` (`language_string`,`translate_behavior`) VALUES (?,?)";
            default:
                return "INSERT OR ABORT INTO `excluded_sites` (`url`) VALUES (?)";
        }
    }

    public final void u(wsk wskVar, Object obj) {
        switch (this.k) {
            case 0:
                pb2 pb2Var = (pb2) obj;
                wskVar.h(1, pb2Var.a);
                List list = pb2Var.b;
                qpb qpbVar = rpb.d;
                qpbVar.getClass();
                xhk xhkVar = xhk.a;
                wskVar.h(2, qpbVar.b(list, new k72(xhkVar, (byte) 0)));
                String str = pb2Var.c;
                if (str == null) {
                    wskVar.j1(3);
                } else {
                    wskVar.h(3, str);
                }
                wskVar.h(4, pb2Var.d);
                List list2 = pb2Var.e;
                qpbVar.getClass();
                wskVar.h(5, qpbVar.b(list2, new k72(xhkVar, (byte) 0)));
                wskVar.T0(6, pb2Var.f);
                break;
            case 1:
                wskVar.h(1, ((s0o) obj).a);
                break;
            case 2:
                dj3 dj3Var = (dj3) obj;
                wskVar.h(1, dj3Var.a);
                wskVar.h(2, mi3.a(dj3Var.b));
                String str2 = dj3Var.c;
                if (str2 == null) {
                    qp2.n("Cannot bind NULLABLE value 'raw' of inline class 'SHA256HexLowercase' to a NOT NULL column.");
                    break;
                } else {
                    wskVar.h(3, str2);
                    wskVar.T0(4, dj3Var.d);
                    wskVar.T0(5, dj3Var.e);
                    wskVar.T0(6, dj3Var.f);
                    wskVar.T0(7, dj3Var.g ? 1L : 0L);
                    break;
                }
            case 3:
                x4l x4lVar = (x4l) obj;
                wskVar.h(1, x4lVar.a);
                String str3 = x4lVar.b;
                if (str3 == null) {
                    wskVar.j1(2);
                } else {
                    wskVar.h(2, str3);
                }
                wskVar.T0(3, x4lVar.c);
                wskVar.T0(4, x4lVar.d);
                break;
            case 4:
                m7l m7lVar = (m7l) obj;
                wskVar.T0(1, m7lVar.a);
                l7l l7lVar = m7lVar.b;
                crb crbVar = n7l.d;
                crbVar.getClass();
                k7l k7lVar = l7l.Companion;
                wskVar.h(2, crbVar.b(l7lVar, k7lVar.serializer()));
                l7l l7lVar2 = m7lVar.c;
                crbVar.getClass();
                wskVar.h(3, crbVar.b(l7lVar2, k7lVar.serializer()));
                break;
            case 5:
                wskVar.h(1, ((sr8) obj).a);
                break;
            case 6:
                yca ycaVar = (yca) obj;
                wskVar.h(1, ycaVar.a);
                wskVar.h(2, ycaVar.b);
                break;
            case 7:
                ruc rucVar = (ruc) obj;
                wskVar.T0(1, rucVar.a);
                wskVar.T0(2, rucVar.b.a);
                wskVar.h(3, rucVar.c);
                wskVar.h(4, rucVar.d);
                wskVar.T0(5, rucVar.e);
                wskVar.T0(6, rucVar.f);
                wskVar.h(7, rucVar.g);
                wskVar.h(8, rucVar.h);
                wskVar.T0(9, rucVar.i);
                wskVar.T0(10, rucVar.j);
                wskVar.h(11, rucVar.k);
                String str4 = rucVar.l;
                if (str4 == null) {
                    wskVar.j1(12);
                } else {
                    wskVar.h(12, str4);
                }
                String str5 = rucVar.m;
                if (str5 == null) {
                    wskVar.j1(13);
                } else {
                    wskVar.h(13, str5);
                }
                wskVar.T0(14, rucVar.n);
                Long l = rucVar.o;
                if (l == null) {
                    wskVar.j1(15);
                } else {
                    wskVar.T0(15, l.longValue());
                }
                Long l2 = rucVar.p;
                if (l2 == null) {
                    wskVar.j1(16);
                } else {
                    wskVar.T0(16, l2.longValue());
                }
                Long l3 = rucVar.q;
                if (l3 == null) {
                    wskVar.j1(17);
                } else {
                    wskVar.T0(17, l3.longValue());
                }
                Long l4 = rucVar.r;
                if (l4 == null) {
                    wskVar.j1(18);
                } else {
                    wskVar.T0(18, l4.longValue());
                }
                Long l5 = rucVar.s;
                if (l5 == null) {
                    wskVar.j1(19);
                } else {
                    wskVar.T0(19, l5.longValue());
                }
                Long l6 = rucVar.t;
                if (l6 == null) {
                    wskVar.j1(20);
                } else {
                    wskVar.T0(20, l6.longValue());
                }
                Long l7 = rucVar.u;
                if (l7 == null) {
                    wskVar.j1(21);
                } else {
                    wskVar.T0(21, l7.longValue());
                }
                Long l8 = rucVar.v;
                if (l8 == null) {
                    wskVar.j1(22);
                } else {
                    wskVar.T0(22, l8.longValue());
                }
                Long l9 = rucVar.w;
                if (l9 != null) {
                    wskVar.T0(23, l9.longValue());
                    break;
                } else {
                    wskVar.j1(23);
                    break;
                }
            case 8:
                r0f r0fVar = (r0f) obj;
                wskVar.T0(1, r0fVar.a);
                wskVar.T0(2, r0fVar.b.a ? 1L : 0L);
                wskVar.T0(3, r0fVar.c);
                wskVar.T0(4, r0fVar.d ? 1L : 0L);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                fh9 fh9Var = (fh9) obj;
                wskVar.T0(1, fh9Var.a);
                wskVar.T0(2, fh9Var.b.a ? 1L : 0L);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                gh9 gh9Var = (gh9) obj;
                wskVar.T0(1, gh9Var.a);
                wskVar.T0(2, gh9Var.b.a ? 1L : 0L);
                break;
            case 11:
                hh9 hh9Var = (hh9) obj;
                wskVar.T0(1, hh9Var.a);
                wskVar.T0(2, hh9Var.b.a ? 1L : 0L);
                break;
            case 12:
                vc8 vc8Var = (vc8) obj;
                wskVar.h(1, vc8Var.a);
                String str6 = vc8Var.b;
                if (str6 == null) {
                    wskVar.j1(2);
                } else {
                    wskVar.h(2, str6);
                }
                String str7 = vc8Var.c;
                if (str7 == null) {
                    wskVar.j1(3);
                } else {
                    wskVar.h(3, str7);
                }
                wskVar.T0(4, vc8Var.d);
                wskVar.h(5, vc8Var.e);
                wskVar.B(6, vc8Var.f);
                wskVar.T0(7, vc8Var.g);
                String str8 = vc8Var.h;
                if (str8 == null) {
                    wskVar.j1(8);
                } else {
                    wskVar.h(8, str8);
                }
                wskVar.T0(9, vc8Var.i);
                break;
            case 13:
                o7f o7fVar = (o7f) obj;
                wskVar.h(1, o7fVar.a);
                String str9 = o7fVar.b;
                if (str9 == null) {
                    wskVar.j1(2);
                } else {
                    wskVar.h(2, str9);
                }
                String str10 = o7fVar.c;
                if (str10 == null) {
                    wskVar.j1(3);
                } else {
                    wskVar.h(3, str10);
                }
                String str11 = o7fVar.d;
                if (str11 == null) {
                    wskVar.j1(4);
                } else {
                    wskVar.h(4, str11);
                }
                String str12 = o7fVar.e;
                if (str12 == null) {
                    wskVar.j1(5);
                } else {
                    wskVar.h(5, str12);
                }
                String str13 = o7fVar.f;
                if (str13 != null) {
                    wskVar.h(6, str13);
                    break;
                } else {
                    wskVar.j1(6);
                    break;
                }
            case 14:
                quc qucVar = (quc) obj;
                wskVar.T0(1, qucVar.a);
                wskVar.h(2, qucVar.b);
                break;
            case 15:
                fvd fvdVar = (fvd) obj;
                wskVar.T0(1, fvdVar.a);
                wskVar.T0(2, fvdVar.b);
                wskVar.h(3, fvdVar.c);
                wskVar.h(4, fvdVar.d);
                wskVar.h(5, fvdVar.e);
                String str14 = fvdVar.f;
                if (str14 == null) {
                    wskVar.j1(6);
                } else {
                    wskVar.h(6, str14);
                }
                wskVar.h(7, fvdVar.g);
                wskVar.h(8, fvdVar.h);
                String str15 = fvdVar.i;
                if (str15 != null) {
                    wskVar.h(9, str15);
                    break;
                } else {
                    wskVar.j1(9);
                    break;
                }
            case 16:
                wskVar.T0(1, r15.a);
                wskVar.T0(2, ((omh) obj).b);
                break;
            case 17:
                gqh gqhVar = (gqh) obj;
                wskVar.h(1, gqhVar.a);
                wskVar.h(2, gqhVar.b);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                nxd nxdVar = (nxd) obj;
                wskVar.h(1, nxdVar.a);
                wskVar.T0(2, nxdVar.b);
                wskVar.T0(3, nxdVar.c);
                wskVar.T0(4, nxdVar.d);
                wskVar.T0(5, nxdVar.e);
                wskVar.T0(6, nxdVar.f ? 1L : 0L);
                break;
            case 19:
                wskVar.T0(1, r15.a);
                wskVar.B(2, ((r7h) obj).b);
                break;
            case SizeUtil.textSize0 /* 20 */:
                l2g l2gVar = (l2g) obj;
                wskVar.T0(1, l2gVar.a);
                wskVar.h(2, l2gVar.b);
                wskVar.h(3, l2gVar.c);
                wskVar.h(4, l2gVar.d);
                wskVar.B(5, l2gVar.e);
                wskVar.h(6, l2gVar.f);
                wskVar.T0(7, l2gVar.g);
                wskVar.T0(8, l2gVar.h);
                wskVar.B(9, l2gVar.i);
                wskVar.T0(10, l2gVar.j);
                wskVar.T0(11, l2gVar.k);
                break;
            case 21:
                c3g c3gVar = (c3g) obj;
                wskVar.T0(1, c3gVar.a);
                wskVar.T0(2, c3gVar.b);
                wskVar.Z0(3, c3gVar.c);
                break;
            case SizeUtil.textSize1 /* 22 */:
                hd7 hd7Var = (hd7) obj;
                wskVar.h(1, hd7Var.a);
                wskVar.T0(2, hd7Var.b);
                wskVar.T0(3, hd7Var.c);
                break;
            case 23:
                ih ihVar = (ih) obj;
                wskVar.h(1, ihVar.a);
                wskVar.T0(2, ihVar.b);
                break;
            case SizeUtil.textSize2 /* 24 */:
                wskVar.h(1, ((j0c) obj).a);
                wskVar.T0(2, r15.b);
                break;
            default:
                wskVar.h(1, ((zf8) obj).a);
                break;
        }
    }
}
