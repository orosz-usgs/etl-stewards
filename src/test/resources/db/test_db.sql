drop table if exists wqp.result_STEWARDS_2021010110_MINVALUE_to_1995_01;
drop table if exists wqp.result_STEWARDS_2021010110_1995_01_to_2000_01;
drop table if exists wqp.result_STEWARDS_2021010110_2000_01_to_2005_01;
drop table if exists wqp.result_STEWARDS_2021010110_2005_01_to_2010_01;
drop table if exists wqp.result_STEWARDS_2021010110_2010_01_to_2015_01;
drop table if exists wqp.result_STEWARDS_2021010110_2015_01_to_maxvalue;
drop table if exists wqp.org_data_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'org_data');
drop table if exists wqp.project_data_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'project_data');
drop table if exists wqp.station_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'station');
drop table if exists wqp.bio_hab_metric_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'bio_hab_metric');
drop table if exists wqp.activity_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'activity');
drop table if exists wqp.act_metric_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'act_metric');
drop table if exists wqp.result_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'result');
drop table if exists wqp.r_detect_qnt_lmt_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'r_detect_qnt_lmt');
drop table if exists wqp.prj_ml_weighting_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'prj_ml_weighting');

drop table if exists wqp.activity_sum_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'activity_sum');
drop table if exists wqp.result_sum_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'result_sum');
drop table if exists wqp.org_grouping_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'org_grouping');
drop table if exists wqp.ml_grouping_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'ml_grouping');
drop table if exists wqp.organization_sum_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'organization_sum');
drop table if exists wqp.station_sum_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'station_sum');

drop table if exists wqp.assemblage_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'assemblage');
drop table if exists wqp.char_name_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'char_name');
drop table if exists wqp.char_type_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'char_type');
drop table if exists wqp.country_testsr cascade;
select create_swap_table ('stewards', 'wqp', 'country');
drop table if exists wqp.county_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'county');
drop table if exists wqp.monitoring_loc_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'monitoring_loc');
drop table if exists wqp.organization_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'organization');
drop table if exists wqp.project_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'project');
drop table if exists wqp.project_dim_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'project_dim');
drop table if exists wqp.sample_media_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'sample_media');
drop table if exists wqp.site_type_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'site_type');
drop table if exists wqp.state_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'state');
drop table if exists wqp.taxa_name_swap_stewards cascade;
select create_swap_table ('stewards', 'wqp', 'taxa_name');
