package vu.che.home_budget.flow;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class FlowServiceImpl implements FlowService{

    private final FlowRepository flowRepository;
    private final FlowMapper flowMapper;

    @Override
    public Optional<Flow> getById(Long id) {
        return flowRepository.findById(id).map(flowMapper::mapToModel);
    }
}
