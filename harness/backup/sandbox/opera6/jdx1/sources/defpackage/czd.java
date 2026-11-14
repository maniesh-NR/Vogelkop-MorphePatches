package defpackage;

import android.database.SQLException;
import androidx.work.OverwritingInputMerger;

/* loaded from: classes.dex */
public final class czd extends ryd {
    public static final czd d = new czd(11, 12, 0);
    public static final czd e = new czd(12, 13, 1);
    public static final czd f = new czd(15, 16, 2);
    public static final czd g = new czd(16, 17, 3);
    public static final czd h = new czd(1, 2, 4);
    public static final czd i = new czd(3, 4, 5);
    public static final czd j = new czd(4, 5, 6);
    public static final czd k = new czd(6, 7, 7);
    public static final czd l = new czd(7, 8, 8);
    public static final czd m = new czd(8, 9, 9);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czd(int i2, int i3, byte b) {
        super(i2, i3);
        this.c = b;
    }

    @Override // defpackage.ryd
    public final void a(to9 to9Var) throws SQLException {
        switch (this.c) {
            case 0:
                to9Var.n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                to9Var.n("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                to9Var.n("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                j7c.r(to9Var, "DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)", "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0", "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )", "INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                to9Var.n("DROP TABLE `SystemIdInfo`");
                to9Var.n("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case 3:
                to9Var.n(kik.c("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                to9Var.n("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                j7c.r(to9Var, "INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                to9Var.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                j7c.r(to9Var, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ", "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ", "DROP TABLE IF EXISTS alarmInfo", "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                to9Var.n("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                to9Var.n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                to9Var.n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                to9Var.n("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                to9Var.n("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                to9Var.n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            case 10:
                j7c.r(to9Var, "CREATE TABLE new_chat (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,`session` TEXT,`created` INTEGER NOT NULL,`title` TEXT,`expired` INTEGER NOT NULL)", "INSERT INTO new_chat (`id`, `created`, `title`, `expired`)SELECT `id`, `created`, `title`, 1 FROM chat", "DROP TABLE chat", "ALTER TABLE new_chat RENAME TO chat");
                break;
            case 11:
                to9Var.n("ALTER TABLE chat_message ADD COLUMN `messageId` TEXT NULL");
                break;
            case 12:
                to9Var.n("DROP TABLE asset_links");
                to9Var.n("CREATE TABLE asset_links (domain TEXT NOT NULL, relation TEXT NOT NULL, namespace TEXT, packageName TEXT NOT NULL, sha256CertFingerprints TEXT NOT NULL, timestamp INTEGER NOT NULL, PRIMARY KEY(domain, packageName))");
                break;
            case 13:
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS `events_new` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, `tournamentName` TEXT NOT NULL, `homeTeamName` TEXT NOT NULL, `homeTeamLogoUrl` TEXT NOT NULL, `homeTeamScore` INTEGER NOT NULL, `homeTeamScorePenalties` INTEGER NOT NULL, `awayTeamName` TEXT NOT NULL, `awayTeamLogoUrl` TEXT NOT NULL, `awayTeamScore` INTEGER NOT NULL, `awayTeamScorePenalties` INTEGER NOT NULL, `eventStatus` TEXT NOT NULL, `finishType` TEXT, `startTimestamp` INTEGER NOT NULL, `order` INTEGER NOT NULL, `statusDescription` TEXT, `timeCurrent` INTEGER, `timeFirstHalf` INTEGER, `timeFirstHalfExtended` INTEGER, `timeSecondHalf` INTEGER, `timeSecondHalfExtended` INTEGER, `timeFirstHalfExtra` INTEGER, `timeFirstHalfExtraExtended` INTEGER, `timeSecondHalfExtra` INTEGER, `timeSecondHalfExtraExtended` INTEGER, PRIMARY KEY(`oscoreId`, `sport`))", "INSERT INTO `events_new` (`oscoreId`, `sport`, `tournamentName`, `homeTeamName`, `homeTeamLogoUrl`, `homeTeamScore`, `homeTeamScorePenalties`, `awayTeamName`, `awayTeamLogoUrl`, `awayTeamScore`, `awayTeamScorePenalties`, `eventStatus`, `finishType`, `startTimestamp`, `order`, `statusDescription`, `timeCurrent`, `timeFirstHalf`, `timeFirstHalfExtended`, `timeSecondHalf`, `timeSecondHalfExtended`, `timeFirstHalfExtra`, `timeFirstHalfExtraExtended`, `timeSecondHalfExtra`, `timeSecondHalfExtraExtended`) SELECT `oscoreId`, 0, `tournamentName`, `homeTeamName`, `homeTeamLogoUrl`, `homeTeamScore`, `homeTeamScorePenalties`, `awayTeamName`, `awayTeamLogoUrl`, `awayTeamScore`, `awayTeamScorePenalties`, `eventStatus`, `finishType`, `startTimestamp`, `order`, `statusDescription`, `timeCurrent`, `timeFirstHalf`, `timeFirstHalfExtended`, `timeSecondHalf`, `timeSecondHalfExtended`, `timeFirstHalfExtra`, `timeFirstHalfExtraExtended`, `timeSecondHalfExtra`, `timeSecondHalfExtraExtended` FROM `events`", "DROP TABLE `events`", "ALTER TABLE `events_new` RENAME TO `events`");
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS `followed_matches_new` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))", "INSERT INTO `followed_matches_new` (`oscoreId`, `sport`) SELECT `oscoreId`, 0 FROM `followed_matches`", "DROP TABLE `followed_matches`", "ALTER TABLE `followed_matches_new` RENAME TO `followed_matches`");
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS `followed_teams_new` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))", "INSERT INTO `followed_teams_new` (`oscoreId`, `sport`) SELECT `oscoreId`, 0 FROM `followed_teams`", "DROP TABLE `followed_teams`", "ALTER TABLE `followed_teams_new` RENAME TO `followed_teams`");
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS `followed_tournaments_new` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`, `sport`))", "INSERT INTO `followed_tournaments_new` (`oscoreId`, `sport`) SELECT `oscoreId`, 0 FROM `followed_tournaments`", "DROP TABLE `followed_tournaments`", "ALTER TABLE `followed_tournaments_new` RENAME TO `followed_tournaments`");
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS `notifications_new` (`oscoreId` INTEGER NOT NULL, `sport` INTEGER NOT NULL, `ttlEndTimestamp` INTEGER NOT NULL, `subscribed` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`oscoreId`, `sport`))", "INSERT INTO `notifications_new` (`oscoreId`, `sport`, `ttlEndTimestamp`, `subscribed`) SELECT `oscoreId`, 0, `ttlEndTimestamp`, `subscribed` FROM `notifications`", "DROP TABLE `notifications`", "ALTER TABLE `notifications_new` RENAME TO `notifications`");
                break;
            case 14:
                to9Var.n("ALTER TABLE `event_odds` ADD COLUMN `delta` INTEGER NOT NULL DEFAULT 0");
                break;
            case 15:
                to9Var.n("CREATE TABLE IF NOT EXISTS `football_events` (`oscoreId` INTEGER NOT NULL, `homeTeamName` TEXT NOT NULL, `homeTeamLogoUrl` TEXT NOT NULL, `homeTeamScore` INTEGER NOT NULL, `homeTeamScorePenalties` INTEGER NOT NULL, `awayTeamName` TEXT NOT NULL, `awayTeamLogoUrl` TEXT NOT NULL, `awayTeamScore` INTEGER NOT NULL, `awayTeamScorePenalties` INTEGER NOT NULL, `eventStatus` TEXT NOT NULL, `finishType` TEXT, `startTimestamp` INTEGER NOT NULL, `statusDescription` TEXT, `timeCurrent` INTEGER, `timeFirstHalf` INTEGER, `timeFirstHalfExtended` INTEGER, `timeSecondHalf` INTEGER, `timeSecondHalfExtended` INTEGER, `timeFirstHalfExtra` INTEGER, `timeFirstHalfExtraExtended` INTEGER, `timeSecondHalfExtra` INTEGER, `timeSecondHalfExtraExtended` INTEGER, PRIMARY KEY(`oscoreId`))");
                to9Var.n("INSERT INTO `football_events` (`oscoreId`, `homeTeamName`, `homeTeamLogoUrl`, `homeTeamScore`, `homeTeamScorePenalties`, `awayTeamName`, `awayTeamLogoUrl`, `awayTeamScore`, `awayTeamScorePenalties`, `eventStatus`, `finishType`, `startTimestamp`, `statusDescription`, `timeCurrent`, `timeFirstHalf`, `timeFirstHalfExtended`, `timeSecondHalf`, `timeSecondHalfExtended`, `timeFirstHalfExtra`, `timeFirstHalfExtraExtended`, `timeSecondHalfExtra`, `timeSecondHalfExtraExtended`) SELECT `oscoreId`, `homeTeamName`, `homeTeamLogoUrl`, `homeTeamScore`, `homeTeamScorePenalties`, `awayTeamName`, `awayTeamLogoUrl`, `awayTeamScore`, `awayTeamScorePenalties`, `eventStatus`, `finishType`, `startTimestamp`, `statusDescription`, `timeCurrent`, `timeFirstHalf`, `timeFirstHalfExtended`, `timeSecondHalf`, `timeSecondHalfExtended`, `timeFirstHalfExtra`, `timeFirstHalfExtraExtended`, `timeSecondHalfExtra`, `timeSecondHalfExtraExtended` FROM `events`");
                to9Var.n("DROP TABLE `events`");
                break;
            case 16:
                to9Var.n("CREATE TABLE IF NOT EXISTS `football_audio_commentary` (`oscoreId` INTEGER NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`oscoreId`))");
                break;
            case 17:
                to9Var.n("ALTER TABLE `football_events` ADD COLUMN `source` INTEGER NOT NULL DEFAULT 0");
                to9Var.n("UPDATE `football_events` SET `source` = 2 WHERE `oscoreId` IN (SELECT `oscoreId` FROM `followed_matches` WHERE `sport` = 0)");
                break;
            case 18:
                to9Var.n("CREATE TABLE IF NOT EXISTS `notifications` (`oscoreId` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`))");
                break;
            case 19:
                to9Var.n("ALTER TABLE `events` ADD COLUMN `order` INTEGER NOT NULL DEFAULT 0");
                break;
            case 20:
                to9Var.n("ALTER TABLE `events` ADD COLUMN `homeTeamScorePenalties` INTEGER NOT NULL DEFAULT 0");
                to9Var.n("ALTER TABLE `events` ADD COLUMN `awayTeamScorePenalties` INTEGER NOT NULL DEFAULT 0");
                break;
            case 21:
                to9Var.n("ALTER TABLE `notifications` ADD COLUMN `ttlEndTimestamp` INTEGER NOT NULL DEFAULT 0");
                break;
            case 22:
                to9Var.n("CREATE TABLE IF NOT EXISTS `followed_matches` (`oscoreId` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`))");
                to9Var.n("CREATE TABLE IF NOT EXISTS `followed_teams` (`oscoreId` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`))");
                to9Var.n("CREATE TABLE IF NOT EXISTS `followed_tournaments` (`oscoreId` INTEGER NOT NULL, PRIMARY KEY(`oscoreId`))");
                break;
            case 23:
                to9Var.n("ALTER TABLE `notifications` ADD COLUMN `subscribed` INTEGER NOT NULL DEFAULT 1");
                break;
            case 24:
                to9Var.n("CREATE TABLE IF NOT EXISTS `event_odds` (`oddsId` TEXT NOT NULL,`eventOscoreId` INTEGER NOT NULL,`name` TEXT NOT NULL,`value` REAL NOT NULL,`jumpUrl` TEXT,`order` INTEGER NOT NULL,PRIMARY KEY(`oddsId`))");
                to9Var.n("CREATE TABLE IF NOT EXISTS `odds_provider_config` (`id` TEXT NOT NULL,`name` TEXT,`normalIcon` TEXT,`lightIcon` TEXT,`smallIcon` TEXT,`logoClickUrl` TEXT,PRIMARY KEY(`id`))");
                break;
            case 25:
                to9Var.n("ALTER TABLE `event_odds` ADD COLUMN `oddsProvider` TEXT");
                to9Var.n("ALTER TABLE `event_odds` ADD COLUMN `oddsType` TEXT");
                break;
            case 26:
                j7c.r(to9Var, "ALTER TABLE `events` ADD COLUMN `statusDescription` TEXT", "ALTER TABLE `events` ADD COLUMN `timeCurrent` INTEGER", "ALTER TABLE `events` ADD COLUMN `timeFirstHalf` INTEGER", "ALTER TABLE `events` ADD COLUMN `timeFirstHalfExtended` INTEGER");
                j7c.r(to9Var, "ALTER TABLE `events` ADD COLUMN `timeSecondHalf` INTEGER", "ALTER TABLE `events` ADD COLUMN `timeSecondHalfExtended` INTEGER", "ALTER TABLE `events` ADD COLUMN `timeFirstHalfExtra` INTEGER", "ALTER TABLE `events` ADD COLUMN `timeFirstHalfExtraExtended` INTEGER");
                to9Var.n("ALTER TABLE `events` ADD COLUMN `timeSecondHalfExtra` INTEGER");
                to9Var.n("ALTER TABLE `events` ADD COLUMN `timeSecondHalfExtraExtended` INTEGER");
                break;
            case 27:
                to9Var.n("ALTER TABLE messages ADD COLUMN iv_metadata TEXT NOT NULL DEFAULT ''");
                to9Var.n("UPDATE messages SET iv_metadata = iv");
                break;
            case 28:
                to9Var.n("ALTER TABLE messages ADD COLUMN local_content TEXT");
                break;
            default:
                to9Var.n("UPDATE messages SET local_content=NULL WHERE local_content LIKE 'data:%'");
                break;
        }
    }
}
