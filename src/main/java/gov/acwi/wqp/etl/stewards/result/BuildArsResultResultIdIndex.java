package gov.acwi.wqp.etl.stewards.result;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class BuildArsResultResultIdIndex implements Tasklet {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public BuildArsResultResultIdIndex(@Qualifier("jdbcTemplateArs") JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		jdbcTemplate.execute("create unique index if not exists ars_result_result_id on ars_result (result_id) with (fillfactor = 100)");
		return RepeatStatus.FINISHED;
	}
}
