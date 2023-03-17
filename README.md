# Spring-Boot-Annotations
@Component: This annotation is used to mark a class as a Spring bean. When Spring's component scanning feature is enabled, it will automatically detect and register any classes marked with this annotation.

@Autowired: This annotation is used to inject dependencies into a Spring bean. When a bean is created, Spring will automatically look for other beans that match the type of the dependency and inject them.

@Controller: This annotation is used to mark a class as a Spring MVC controller. It is used to handle incoming HTTP requests and return responses.

@Service: This annotation is used to mark a class as a service component. It is used to implement the business logic of an application.

@Repository: This annotation is used to mark a class as a data access object (DAO) component. It is used to interact with a database or other persistent data store.

@RequestMapping: This annotation is used to map HTTP requests to controller methods. It is used to specify the URL pattern that a particular method should handle.

@Value: This annotation is used to inject values from property files, environment variables, or other sources into a Spring bean.

@Configuration: This annotation is used to mark a class as a configuration class. It is used to define beans and their dependencies using Java code rather than XML.

@Bean: This annotation is used to define a bean in a Spring configuration class. It is used to specify the class or factory method that should be used to create the bean, as well as any dependencies that it requires.
