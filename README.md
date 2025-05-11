
# Spring Framework Tutorial - IoC and DI

This project demonstrates the core concepts of the **Spring Framework**, including **Inversion of Control (IoC)**, **Dependency Injection (DI)**, and Spring's bean lifecycle management using both **Annotation-based** and **XML-based** configuration.

---

## 🧠 Core Concepts

### 🔄 Inversion of Control (IoC)
IoC is a design principle where the control of object creation is transferred from the application code to the Spring container.

### 🔌 Dependency Injection (DI)
DI is a form of IoC where the dependencies of a class are injected by the container at runtime.

---

## 🛠️ Spring IoC Containers

| Container         | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `BeanFactory`     | Basic container with support for DI. Beans are lazily loaded.               |
| `ApplicationContext` | Advanced container built on BeanFactory with additional features like event propagation, AOP, and internationalization. Beans are eagerly loaded. |

---

## 🌟 Key Features of Spring Framework

- IoC Container
- Data Access (JDBC abstraction)
- Spring MVC
- Transaction Management
- Spring Web Services
- Spring TestContext Framework

---

## 🧪 Code Examples

### Annotation-based Configuration (Spring Boot)

#### Main Class

```java
@SpringBootApplication
public class SpringTutorialApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.code("Hritik");
    }
}
```

#### Alien Class

```java
@Component
public class Alien {
    @Autowired
    Laptop obj;

    public void code(String name) {
        System.out.println("Alien " + name + " is coding...");
        obj.compile(name);
    }
}
```

#### Laptop Class

```java
@Component
public class Laptop {
    public void compile(String name) {
        System.out.println("We are compiling laptop for " + name);
    }
}
```

---

### XML-based Configuration (Classic Spring)

#### `Spring.xml`

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

   <bean id="alien" class="org.example.Alien"/>
</beans>
```

#### Main Class

```java
ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
Alien obj = (Alien) context.getBean("alien");
obj.code("Hritik");
```

---

## 🔁 Bean Scopes

### Singleton Scope (Default)
- One instance per Spring container
- Ideal for stateless, shared beans
```xml
<bean id="singletonBean" class="org.example.SingletonBean" scope="singleton"/>
```

### Prototype Scope
- New instance every time the bean is requested
- Ideal for stateful, request-specific beans
```xml
<bean id="prototypeBean" class="org.example.PrototypeBean" scope="prototype"/>
```

| Aspect           | Singleton              | Prototype                  |
|------------------|------------------------|-----------------------------|
| Instances        | One                    | One per request             |
| Lifecycle        | Fully managed          | Only created, not destroyed |
| Use case         | Shared, stateless beans| Stateful, request-scoped    |

---

## 🚀 Why Use Spring?

- **Modularity**: Use only the components you need.
- **Flexibility**: Supports XML, Java-based config, and annotations.
- **Scalability**: Ideal for small to large-scale enterprise apps.
- **Community**: Backed by a robust and active ecosystem.

---

## ⚙️ Spring vs Spring Boot

| Feature                        | Spring                               | Spring Boot                           |
|-------------------------------|--------------------------------------|----------------------------------------|
| Purpose                       | Enterprise app development           | REST API and microservices             |
| Server                        | Needs manual setup                   | Embedded servers (Tomcat, Jetty)       |
| Configuration                 | Manual (XML, annotations)            | Auto-configuration                     |
| Boilerplate Code              | More                                 | Less                                   |
| In-memory DB Support          | No                                   | Yes (e.g., H2)                         |
| Dependency Management         | Manual (pom.xml)                     | Simplified                            |

---

## 📂 Project Structure

```
spring_tutorial/
├── src/
│   └── main/
│       └── java/
│           └── com/springBoot/spring_tutorial/
│               ├── SpringTutorialApplication.java
│               ├── Alien.java
│               └── Laptop.java
│
├── resources/
│   └── Spring.xml (for XML configuration)
│
└── pom.xml
```

---

## 📚 References

- [Spring Framework Docs](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Spring Boot Docs](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Maven Central Repository](https://mvnrepository.com/)

---

## 🧑‍💻 Author

**Hritik**  
Beginner-level exploration of Spring Framework concepts including IoC and DI.

---



