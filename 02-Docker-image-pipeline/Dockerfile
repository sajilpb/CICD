FROM public.ecr.aws/docker/library/node:22.21.1-alpine3.21 AS builder

WORKDIR /app

# Install dependencies first for caching
COPY package*.json ./
RUN npm ci --only=production

# Copy application source
COPY . .

FROM public.ecr.aws/docker/library/node:22.21.1-alpine3.21 AS runner

WORKDIR /app

# Copy only the built app and dependencies from the builder image
COPY --from=builder /app .

EXPOSE 5000

CMD ["node", "app.js"]