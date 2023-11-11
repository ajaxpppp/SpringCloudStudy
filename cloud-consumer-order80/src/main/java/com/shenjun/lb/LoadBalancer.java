package com.shenjun.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Service
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
