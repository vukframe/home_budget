package vu.che.home_budget.flow;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vu.che.utils.web.Response;

@RestController
@RequestMapping(value = "flow")
@RequiredArgsConstructor
public class FlowEndpoint {

    private final FlowService flowService;

}
